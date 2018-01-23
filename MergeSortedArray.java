// Problem 88
// Merge Sorted Array
public class MergeSortedArray{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[][] input1 = {
            {7,9,10,0,0,0}
        };
        int[] input2 = {3};
        
        int[][] input3 = {
            {4,8,11}
        };
        int[] input4 = {3};
        
        for(int i = 0 ; i < input1.length; i++)
            solution.merge(input1[i],input2[i],input3[i],input4[i]);
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while(m > 0 && n > 0) 
            nums1[m+n-1] = (nums1[m - 1] > nums2[n - 1]) 
                    ? nums1[m-- - 1] : nums2[n-- - 1];
        while(n > 0)
            nums1[m+n-1] = nums2[n-- -1];
    }
}