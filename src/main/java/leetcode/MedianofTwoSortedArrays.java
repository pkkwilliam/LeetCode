package leetcode;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */

import java.util.List;
import java.util.ArrayList;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int num1Count = 0, num2Count = 0;
        while(num1Count < nums1.length || num2Count < nums2.length){
            int number1 = (num1Count < nums1.length) ? nums1[num1Count] : Integer.MAX_VALUE;
            int number2 = (num2Count < nums2.length) ? nums2[num2Count] : Integer.MAX_VALUE;
            if(number1 < number2){
                list.add(number1);
                num1Count++;
            }else{
                list.add(number2);
                num2Count++;
            }
        }
        System.out.println("List: "+list);
        if(list.size() < 1)
            return 0;
        else if(list.size() < 2)
            return list.get(0);
        double result = (list.size() % 2 == 1) ?
                list.get(list.size() / 2) :
                ((double)(list.get(list.size() / 2) + (double)list.get(list.size() / 2 - 1)) / 2);
        return result;
    }
}