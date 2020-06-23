package leetcode;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */

/*
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 1 or 5
Explanation: Your function can return either index number 1 where the peak element is 2,
             or index number 5 where the peak element is 6.
Follow up: Your solution should be in logarithmic complexity.
 */

public class FindPeakElement {
  public int findPeakElement(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      int leftValue = getLeftValue(nums, i);
      int rightValue = getRightVale(nums, i);
      if (nums[i] > leftValue && nums[i] > rightValue) {
        return i;
      }
    }
    return nums.length - 1;
  }

  protected int getLeftValue(int[] nums, int index) {
    return index - 1 >= 0 ? nums[index - 1] : Integer.MIN_VALUE;
  }

  protected int getRightVale(int[] nums, int index) {
    return index + 1 < nums.length ? nums[index + 1] : Integer.MIN_VALUE;
  }
}
