package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 12/31/19
 * Version: 1.0.0
 */

/*
  Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose !!!sum!!! equals to k.

  Example 1:
  Input:nums = [1,1,1], k = 2
  Output: 2
  Note:
  The length of the array is in range [1, 20,000].
  The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */

public class SubarraySumEqualsK {
  public int subarraySum(int[] nums, int k) {
    int result = 0;
    for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
        result += checkCurrentIndex(nums, k, currentIndex);
    }
    return result;
  }

  protected int checkCurrentIndex(int[] nums, int k, int index) {
    int result = nums[index] == k ? 1 : 0;
    int sum = nums[index];
    while (index + 1 < nums.length) {
      int addUp = sum + nums[index + 1];
      if (addUp == k) {
        result++;
      }
      sum += nums[index + 1];
      index++;
    }
    return result;
  }
}
