package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

/*
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 7 x 3 grid. How many possible unique paths are there?



Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
Example 2:

Input: m = 7, n = 3
Output: 28


Constraints:

1 <= m, n <= 100
It's guaranteed that the answer will be less than or equal to 2 * 10 ^ 9.
 */

public class UniquePaths {

  static Exception p() {
    throw new RuntimeException();
  }

  public int uniquePaths(int m, int n) {
    int[][] grid = new int[m][n];
    grid[0][0] = 1;
    for (int row = 0; row < grid.length; row++) {
      for (int column = 0; column < grid[row].length; column++) {
        if (row == 0 && column == 0) {
          continue;
        } else {
          int topValue = row > 0 ? grid[row - 1][column] : 0;
          int leftValue = column > 0 ? grid[row][column - 1] : 0;
          grid[row][column] = topValue + leftValue;
        }
      }
    }
    return grid[m - 1][n - 1];
  }

}
