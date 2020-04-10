package leetcode;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[][] array = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            array[i][0] = nums[i];
            array[i][1] = i;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] i1, int[] i2) {
                if (i1[0] > i2[0])
                    return 1;
                return -1;
            }
        });
        int left = 0, right = array.length - 1;
        while (left < right) {
            int sum = array[left][0] + array[right][0];
            if (sum == target)
                break;
            else if (sum > target)
                right--;
            else if (sum < target)
                left++;
        }
        return new int[]{array[left][1], array[right][1]};
    }

    public int[] twoSumHashMap(int[] num, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < num.length; i++) {
            int needNumber = target - num[i];
            if (map.containsKey(needNumber)) {
                result[0] = i;
                result[1] = map.get(needNumber);
            } else {
                map.put(num[i], i);
            }
        }
        return result;
    }

}