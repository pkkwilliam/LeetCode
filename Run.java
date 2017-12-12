// Problem 4
// Median of Two Sorted Arrays

import java.util.Arrays;
import java.util.LinkedList;

public class Run{
    public static void main(String[]args){
        Solution solution = new Solution();
   		int [] array1 = {1};
   		int [] array2 = {1,2,3,4};
   		int [] sortArray = array2;
   		Arrays.sort(sortArray);
   		
   		double result = solution.findMedianSortedArrays(array1,array2);
   		System.out.println("Result: "+result);
   		/*if(sortArray.length % 2 == 0)
   			System.out.println("Median = "+sortArray[sortArray.length/2-1]+" "+sortArray[sortArray.length/2]);
   		else
   			System.out.println(sortArray[sortArray.length/2]);*/
    }
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double a1 = 0;
		double a2 = 0;
		// Array 1
    	if(nums1.length == 0)
    		a1 = 0;
    	else if(nums1.length == 1)
    		a1 = nums1[0];
    	else
    		a1 = findMedianLongerThanTwo(nums1);
    	
    	//Array 2
    	if(nums2.length == 0)
    		a2 = 0;
    	else if(nums2.length == 1)
    		a2 = nums2[0];
    	else 
    		a2 = findMedianLongerThanTwo(nums2);
    	
    	return (a1+a2)/2.0;    	
    }
    double findMedianLongerThanTwo(int [] array){
    	LinkedList<Integer> list = new LinkedList<Integer>();
    	list.add(array[0]);
    	if(array[1] > list.get(0))
    		list.addLast(array[1]);
   		else
   			list.addFirst(array[1]);
    	//System.out.println(list);
    	for(int i = 2; i < array.length; i++){
    		int leftValIndex = list.size() / 2 - 1;
    		int rightValIndex = list.size() / 2;
    		if(array[i] >= list.get(leftValIndex) && array[i] <= list.get(rightValIndex)){
    			int temp = list.get(leftValIndex);
    			list.set(leftValIndex, array[i]);
    			list.addFirst(temp);			
    		}else if(array[i] < list.get(leftValIndex))
    			list.addFirst(array[i]);
    		else if(array[i] > list.get(rightValIndex))
    			list.addLast(array[i]);
    		//System.out.println(list);
    	}
    	if(list.size() % 2 == 0){
   			//System.out.println("Median = "+list.get(list.size()/2-1)+" "+list.get(list.size()/2));
   			double result = (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
    		return result;
    	}
   		else{
   			//System.out.println("Median: "+list.get(list.size()/2));
    		return list.get(list.size()/2);
   		}
    }
}