// Problem 462
// Minimum Moves to Equal Array Elements II
// use median to find the closest move
import java.util.Arrays;
public class MinimumMovestoEqualArrayElementsII{
    public static void main(String[]args){
        Solution solution = new Solution();
        int input [][] = {
            {1,2,3},
            {0,1,1,500},
            {1,2,2,3,4,7,9},
            {1,2,2,3,4,4,7,9},
            {},
            {1},
            {1,2}
        };
        for(int [] i : input)
            System.out.println(solution.minMoves2(i));
    }
}
class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int count = 0;
        for(int i = 0; i < nums.length; i++)
            count += Math.abs(nums[i] - median);
        return count;
    }
}