// Problem 581
// Shortest Unsorted Continuous Subarray

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray{
	public static void main(String[]args){
		Solution solution = new Solution();
        int input [][] = {
        		{2, 6, 4, 8, 10, 9, 15},
        		{9,7,4},
        		{1,2,3,4,5,6,7},
        		{1,3,2,2},
        		{2,3,3,2,4},
        		{1,3,4,5,2}
        		
        };
        for(int [] i : input)
        	System.out.println("Result: "+solution.findUnsortedSubarray(i));
	}
}
class Solution {
    public int minPatches(int[] nums, int n) {
        
    }
}