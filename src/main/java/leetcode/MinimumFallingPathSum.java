package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 1/17/20
 * Version: 1.0.0
 */

public class MinimumFallingPathSum {

  public int minFallingPathSum(int[][] A) {
    return dynamicPrograming(A);
  }

  protected int dynamicPrograming(int[][] A) {
    int lastRow = A.length - 1, lastColumn = A[0].length - 1;
    for (int row = 1; row <= lastRow; row++) {
      for (int column = 0; column <= lastColumn; column++) {
        int columnMinimum = Integer.MAX_VALUE;
        // top Left
        if (column  - 1 >= 0 && A[row - 1][column - 1] < columnMinimum) {
          columnMinimum = A[row - 1][column - 1];
        }
        // top
        if (A[row - 1][column] < columnMinimum) {
          columnMinimum = A[row - 1][column];
        }
        // top Right
        if (column + 1 <= lastColumn && A[row - 1][column + 1] < columnMinimum) {
          columnMinimum = A[row - 1][column + 1];
        }
        A[row][column] += columnMinimum;
      }
    }
    int sum = Integer.MAX_VALUE;
    for (int value: A[lastRow]) {
      if (value < sum) {
        sum = value;
      }
    }
    return sum;
  }

}
