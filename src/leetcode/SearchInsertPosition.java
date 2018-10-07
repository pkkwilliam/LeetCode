/*

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0
 */

package leetcode;

public class SearchInsertPosition {
    public static void main(String[]args){
        int[][] test1 = {
                {1,3,5,6},
                {1,3},
                {},
                {1},
                {1,3,5,6}
        };
        int[] test2 = {
            2, 0, 0,7,7
        };
        for(int i = 0; i < test1.length; i++)
            System.out.println(new Solution35().searchInsert(test1[i],test2[i]));
    }
}
class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == target)
                return i;
            else if(nums[i] > target)
                return i;
        return nums.length;
    }
}