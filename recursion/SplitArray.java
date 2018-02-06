/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray(). (No loops needed.)


splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
*/

public class SplitArray{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input = {
            {2,2},
            {2,3},
            {5,2,3},
            {2,4}
        };

        for(int i = 0; i < input.length; i++)
            System.out.println(solution.splitArray(input[i]));
    }
}

class Solution{
    public boolean splitArray(int[] nums) {
        int target = 0;
        for(int i : nums)
            target += i;
        if(target % 2 != 0)
            return false;
        return recursiveHelper(0, nums, target/2);
    }
    private boolean recursiveHelper(int start, int[] nums, int target){
        if(start >= nums.length)
            return(target == 0);
        if(recursiveHelper(start + 1, nums, target - nums[start]))
            return true;
        if(recursiveHelper(start + 1, nums, target))
            return true;
        return false;
    }
}
