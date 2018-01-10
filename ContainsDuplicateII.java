// Problem 219
// Contains Duplicate II

import java.util.HashSet;

public class ContainsDuplicateII{
    public static void main(String[]args){
        Solution solution = new Solution();
        int array [][] = {
        	{-5,-4},
        	{1,2,3,4,5},//false
        	{1,0,1,1},// true
        	{1,2,1},// false
        	{1,2,3,1,2,3}// false
        };
        int atMost [] = {2,2,1,1,2};
        for(int i = 0; i < array.length; i++){
        	System.out.println(solution.containsNearbyDuplicate(array[i],atMost[i]));
        }
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums.length < 1)
    		return false;
    	HashSet<Integer> set = new HashSet<Integer>();
    	for(int i = 0; i < nums.length; i++){ 
    		if(i > k)
    			set.remove(nums[i-k-1]);
    		if(set.contains(nums[i]))
    			return true;
    		set.add(nums[i]);
    	}
        return false;
    }
}
