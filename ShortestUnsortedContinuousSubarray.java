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
    public int findUnsortedSubarray(int[] nums) {
    	int [] sortedNums = nums.clone();
    	Arrays.sort(sortedNums);
    	int start = -1;
    	int end = -2;
    	for(int i = 0; i < nums.length; i++){
    		if(nums[i] != sortedNums[i]){
    			if(start == -1)
    				start = i;
    			end = i;
    		}
    	}
    	return end - start + 1;
    }
}