/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.

 Example 1:
 Input: [1,12,-5,-6,50,3], k = 4
 Output: 12.75
 Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
 Note:
 1 <= k <= n <= 30,000.
 Elements of the given array will be in the range [-10,000, 10,000].
 */
package problem643;

public class MaximumAverageSubarrayI {
    public static void main(String[]args){
        double[][] input = {
            {1,12,-5,-6,50,3}
        };
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = 0.0;
        for(int i = 0; i < nums.length; i++){
            double localSum = 0.0;
            for(int j = i; j < nums.length;j++){

            }
        }
    }
}