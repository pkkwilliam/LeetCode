// Problem 217
// Contains Duplicate

import java.util.Arrays;

public class ContainsDuplicate{
     public static void main(String[]args){
        Solution solution = new Solution();
        int array [][] = {
        	{1,2,3,4,5}
        };
        int atMost [] = {2};
        for(int i = 0; i < array.length; i++){
        	System.out.println(solution.containsNearbyDuplicate(array[i],atMost[i]);
        }
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
        	for(int j = i+1; j < nums.length; j++){
        		if(nums[i] == nums[j])
        			if(Math.abs(j - 1) < k)
        				return true;
        	}
        }
        return false;
    }
}