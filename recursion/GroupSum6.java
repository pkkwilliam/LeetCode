/*
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen. (No loops needed.)


groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
*/

public class GroupSum6{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {5,6,2};
        int[] target = {8,9,7};

        for(int i = 0; i < target.length; i++)
            System.out.println(solution.groupSum6(0, input, target[i]));
    }
}
class Solution{
    public boolean groupSum6(int start, int[] nums, int target) {
        if(start >= nums.length)
            return (target == 0);
        if(groupSum6(start+1, nums, target - nums[start]))
            return true;
        if(nums[start] != 6)
            if(groupSum6(start+1, nums, target))
                return true;
        return false;
    }
}
