package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 1/15/20
 * Version: 1.0.0
 */

public class MinimumPathSum {

  public int minPathSum(int[][] grid) {
    return dynamicProgramMethod(grid);
  }

  protected int dynamicProgramMethod(int[][] grid) {
    final int rowLength = grid.length;
    final int columnLength = grid[rowLength - 1].length;
    for (int row = 0; row < rowLength; row++) {
      for (int column = 0; column <columnLength; column++) {
        if (row == 0 && column == 0) {
          continue;
        } else {
          final int topValue = row - 1 >= 0 ? grid[row - 1][column] : Integer.MAX_VALUE;
          final int leftValue = column -1 >= 0 ? grid[row][column - 1]: Integer.MAX_VALUE;
          grid[row][column] += topValue < leftValue ? topValue : leftValue;
        }
      }
    }
    return grid[rowLength - 1][columnLength - 1];
  }

}
