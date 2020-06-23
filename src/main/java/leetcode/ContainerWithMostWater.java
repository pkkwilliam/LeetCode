package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 4/16/20
 * Version: 1.0.0
 */

public class ContainerWithMostWater {

  // two pointer
  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int globalMaximum = 0;
    while (left < right) {
      final int maximumHeight = Math.min(height[left], height[right]);
      final int distance = right - left;
      if (distance * maximumHeight > globalMaximum) {
        globalMaximum = distance * maximumHeight;
      }
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return globalMaximum;
  }
}
