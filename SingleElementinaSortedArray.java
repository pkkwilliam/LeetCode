// Problem 540
// Single Element in a Sorted Array

public class SingleElementinaSortedArray{
	public static void main(String[]args){
		Solution solution = new Solution();
		int [] input1 = {1,1,2,3,3,4,4,8,8};
		int [] input2 = {0};
		int [] input3 = {1,1,2};
		int [] input4 = {9,9,5};
		int [] input5 = {-99,-99,-8,-8,0,0,9,8,8};
		int [][] totalInput = {input1,input2,input3,input4,input5};
		for(int[] i : totalInput){
			int result = solution.singleNonDuplicate(i);
			System.out.println(result);
		}
	}
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
    	int i = 0;
    	if(nums.length > 2){
	    	while(i + 2 < nums.length){
	    		if(nums[i] != nums[i+1])
	    			return nums[i];
	    		i += 2;
	    	}
	    	return nums[i];
    	}
    	return nums[0];
    }
}
