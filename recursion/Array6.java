/*
Given an array of ints, compute recursively if the array contains a 6. 
We'll use the convention of considering only the part 
of the array that begins at the given index. In this way, 
a recursive call can pass index+1 to move down the array. T
he initial call will pass in index as 0.


array6([1, 6, 4], 0) → true
array6([1, 4], 0) → false
array6([6], 0) → true

*/

public class Array6{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input = {
            {1,6,4},
            {1,4},
            {6}
        };
        for(int[] i : input)
            System.out.println(solution.array6(i, 0));
    }
}
class Solution{
    public boolean array6(int[] nums, int index) {
        if(index == nums.length)
            return false;
        return (nums[index] == 6) ? true : array6(nums, index + 1);
    }
}