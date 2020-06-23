package leetcode;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class RunningSumof1dArray {

  public int[] runningSum(int[] nums) {
    if (nums.length < 2) {
      return nums;
    }
    for (int i = 1; i < nums.length; i++) {
        nums[i] += nums[i - 1];
    }
    return nums;
  }
}
