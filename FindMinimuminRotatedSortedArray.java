/*
153. Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

1 2 3 
7 8 9 0

*/
import java.util.Arrays;
public class FindMinimuminRotatedSortedArray{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input = {
            {4,5,6,7,0,1,2},
            {3,1,2},
            {0},
            {},
            {7,8,9},
            {1,2}
        };
        for(int[] i: input)
            System.out.println(solution.findMin(i));

    }
}
class Solution {
    public int findMin(int[] nums) {
        if(nums.length < 1)
            return 0;
        else if(nums.length < 2)
            return nums[0];
        else if(nums.length < 3)
            return (nums[0] < nums[1]) ? nums[0] : nums[1];
        return recursionHelper(nums, 0, nums.length - 1);
    }
    private int recursionHelper(int[] nums, int left, int right){
        if(left > right)
            return Integer.MAX_VALUE;
        if(left == right)
            return nums[left];
        int recursion = recursionHelper(nums, left + 1, right - 1);
        int current = (nums[left] < nums[right]) ? nums[left] : nums[right];
        return (recursion < current) ? recursion : current;
    }
}