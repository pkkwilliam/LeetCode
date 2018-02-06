/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true

*/

public class Split53{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input = {
            {1,1},
            {1,1,1},
            {2,4,2},
        };

        for(int i = 0; i < input.length; i++)
            System.out.println(solution.split53(input[i]));
    }
}

class Solution{
    public boolean split53(int[] nums) {
        int total = 0;
        for(int i : nums)
            total += i;
        return (total % 2 != 0) ? false : recursiveHelper(0, nums, 0, 0);
    }
    private boolean recursiveHelper(int start, int[] nums, int three, int five){
        if(start >= nums.length)
            return (three == five);
        if(nums[start] % 3 == 0){
            if(recursiveHelper(start + 1, nums, three + nums[start], five))
                return true;
        }
        else if(nums[start] % 5 == 0){
            if(recursiveHelper(start + 1, nums, three, five + nums[start]))
                return true;
        }
        else{
            if(recursiveHelper(start + 1, nums, three + nums[start], five))
                return true;
            if(recursiveHelper(start + 1, nums, three, five + nums[start]))
                return true;
        }
        return false;
    }
}