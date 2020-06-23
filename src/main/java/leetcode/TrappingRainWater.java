package leetcode;

import java.util.Stack;

/**
 * Author: Ka Kei Pun
 * Date: 4/16/20
 * Version: 1.0.0
 */

public class TrappingRainWater {

  public int trap(int[] height) {
    return useStack(height);
  }

  public int useStack(int[] height) {
    final Stack<Integer> stack = new Stack();
    int sum = 0;
    for (int i = 0; i < height.length; i++) {
      while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
        int previousHeight = height[stack.peek()];
        while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
          stack.pop();
        }
        final int distance = i - stack.peek() - 1;
        final int maxHeight = height[i] - previousHeight;
        sum += distance * maxHeight;
      }
      stack.push(i);
    }
    return sum;
  }

}
