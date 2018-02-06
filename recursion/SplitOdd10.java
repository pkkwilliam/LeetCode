/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)


splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
*/

public class SplitOdd10{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input = {
            {5,5,5},
            {5,5,6},
            {5,5,6,1},
            {2,4}
        };

        for(int i = 0; i < input.length; i++)
            System.out.println(solution.splitOdd10(input[i]));
    }
}

class Solution{
    public boolean splitOdd10(int[] nums) {
        int total = 0;
        for(int i : nums)
            total += i;
        if(total % 2 == 0)
            return false;
        return (recursiveHelper(0, nums, 0, total));
    }
    private boolean recursiveHelper(int start, int[] nums, int leftTarget, int total){
        if(start >= nums.length)
            return (leftTarget % 10 == 0 && total % 2 != 0);
        if(recursiveHelper(start + 1, nums, leftTarget + nums[start], total - nums[start]))
            return true;
        if(recursiveHelper(start + 1, nums, leftTarget, total))
            return true;
        return false;
    }
}