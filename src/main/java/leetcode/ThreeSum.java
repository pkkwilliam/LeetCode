package leetcode;
/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

-4 , -1, -1, 0 , 1, 2

-15 -15 -15 -11 -11 -11 -11 0 0 1 1 1 2 2 2 3 5 6 6 6 6 9 9 9 9 9 9 16

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        final List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (i + 2 < nums.length) {
                result.addAll(twoSum(Arrays.copyOfRange(nums, i + 1, nums.length), nums[i] * -1, nums[i]));
            }
        }
        return result;
    }

    protected List<List<Integer>> twoSum(int[] numsChunk, int target, int current) {
        final List<List<Integer>> result = new ArrayList<>();
        int left = 0, right = numsChunk.length - 1;
        while (left < right) {
            int leftValue = numsChunk[left];
            int rightValue = numsChunk[right];
            if (leftValue + rightValue == target) {
                result.add(new ArrayList<>(Arrays.asList(current, leftValue, rightValue)));
                right = skipLeftDuplicate(numsChunk, right, right - 1);
            } else if (leftValue + rightValue > target) {
                right = skipLeftDuplicate(numsChunk, right, right - 1);
            } else if(leftValue + rightValue < target) {
                left = skipRightDuplicate(numsChunk, left, left + 1);
            }
        }
        return result;
    }

    protected int skipRightDuplicate(int[] nums, int currentValueIndex, int nextValueIndex) {
        while (nextValueIndex < nums.length && nums[currentValueIndex] == nums[nextValueIndex]) {
            nextValueIndex++;
        }
        return nextValueIndex;
    }

    protected int skipLeftDuplicate(int[] nums, int currentValueIndex, int nextValueIndex) {
        while (nextValueIndex >= 0 && nums[currentValueIndex] == nums[nextValueIndex]) {
            nextValueIndex--;
        }
        return nextValueIndex;
    }

}