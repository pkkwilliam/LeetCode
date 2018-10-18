/**
 *
 * Ka Kei Pun
 *
 * 10/07/2018 V0.0
 *
 * 491. Increasing Subsequences
 *
 * Given an integer array, your task is to find all the different possible increasing subsequences of the given array, and the length of an increasing subsequence should be at least 2 .
 *
 * Example:
 *
 * Input: [4, 6, 7, 7]
 * Output: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
 * Note:
 *
 * The length of the given array will not exceed 15.
 * The range of integer in the given array is [-100,100].
 * The given array may contain duplicates, and two equal integers should also be considered as a special case of increasing sequence.
 *
 */

// TODO 491. Increasing Subsequences

package leetcode;

import java.util.*;

public class IncreasingSubsequences {
    public static void main(String[]args){
        int[][] input = {
                {4,6,7,7}
        };
        for(int[] array : input){
            for(List<Integer> list : new Solution491().findSubsequences(array)){
                System.out.print("[");
                for(int i : list){
                    System.out.print(i+" ");
                }
                System.out.print("]\n");
            }
        }
    }
}
class Solution491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++){

        }

        return result;
    }
}