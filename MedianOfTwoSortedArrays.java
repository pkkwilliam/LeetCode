// Problem 4
// Median of Two Sorted Arrays

import java.util.LinkedList;

public class MedianOfTwoSortedArrays{
    public static void main(String[]args){
        Solution solution = new Solution();
   		int [] array1 = {};
   		int [] array2 = {1};
   		double result = solution.findMedianSortedArrays(array1,array2);
   		System.out.println("Result: "+result);
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	int countA = 0;
    	int countB = 0;
    	while(countA != nums1.length || countB != nums2.length){
    		if(countA < nums1.length){
    			if(countB == nums2.length || nums1[countA] <= nums2[countB]){
    				list.add(nums1[countA]);
    				countA++;
    			}
    		}
    		if(countB < nums2.length){
    			if(countA == nums1.length || nums2[countB] < nums1[countA]){
    				list.add(nums2[countB]);
    				countB++;
    			}
    		}
    	}
    	System.out.println(list);
    	if(list.size() == 0)
    		return 0.0;
    	else if(list.size() == 1)
    		return list.get(0);
    	else{
	    	double result = list.size() % 2 == 0 ? 
	    			(list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2.0
	    			: list.get(list.size() / 2);
	    	return result;
    	}
	}
}