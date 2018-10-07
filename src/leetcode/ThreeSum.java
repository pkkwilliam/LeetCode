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
    public static void main(String[]args){
        int[][] input = {
                {-1, 0, 1, 2, -1, -4} ,// -4, -1, -1, 0 , 1, 2
                {-1, 0, 1, 2, -1,- 1,-1,-1, -4,2,2,2},
                {9,5,1,2,3,6,-15,2,1,-11,0,2,1,0,16,6,6,6,9,9,9,9,9,-11,-11,-11,-15,-15},
                {0,0,0},
                {0,0,0,0},
                {-2,0,1,1,2},
                {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6}
        };
        for(int[] i : input){
            System.out.println("------------------------");
            List<List<Integer>> result = new Solution15().threeSum(i);
            for(List l : result) {
                for (Object k : l)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }
}
class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(new ArrayList<>());
                    list.get(list.size() - 1).add(nums[i]);
                    list.get(list.size() - 1).add(nums[left]);
                    list.get(list.size() - 1).add(nums[right]);
                }
                if(sum > 0)
                    do{
                        right--;
                    }while(right > 1 && nums[right] == nums[right+1]);
                else
                    do {
                        left++;
                    }while(left < nums.length - 1 && nums[left] == nums[left - 1]);
            }
        }
        return list;
    }
}