package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 1/2/20
 * Version: 1.0.0
 */

public class MissingNumber {
  public int missingNumber(int[] nums) {
    int expected = nums.length * (nums.length + 1) / 2;
    int sum = 0;
    for (int i: nums) {
      sum += i;
    }
    return expected - sum;
  }
}
