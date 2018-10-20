package leetcode;

/*

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

public class MaximumSubarray {
    public int maxSubArrayBrutal(int[] nums) {
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int localSum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                localSum += nums[j];
                if(localSum > maximum)
                    maximum = localSum;
            }
        }
        return maximum;
    }
    public int maxSubArray(int[] nums){
        int maximum = Integer.MIN_VALUE, localSum = 0;
        for(int i = 0; i < nums.length; i++){
            localSum = (nums[i] > localSum + nums[i]) ? nums[i] : localSum + nums[i];
            if(localSum > maximum)
                maximum = localSum;
        }
        return nums.length > 0 ? maximum : 0;
    }
}