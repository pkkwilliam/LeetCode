package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 3/2/20
 * Version: 1.0.0
 */

public class ZeroOneMatrix {

  public int[][] updateMatrix(int[][] matrix) {

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if (matrix[row][column] == 0) {
          continue;
        } else {
          matrix[row][column] += getLowestValue(matrix, row, column);
        }
      }
    }
    return matrix;
  }

  protected int getLowestValue(int[][] matrix, int currentRow, int currentColumn) {
    final int leftValue = getLeftValue(matrix, currentRow, currentColumn);
    final int rightValue = getRightValue(matrix, currentRow, currentColumn);
    final int topValue = getTopValue(matrix, currentRow, currentColumn);
    final int bottomValue = getBottomValue(matrix, currentRow, currentColumn);
    return Integer.min(leftValue, Integer.min(rightValue, Integer.min(topValue, bottomValue)));
  }

  protected int getLeftValue(int[][] matrix, int currentRow, int currentColumn) {
    return currentColumn > 0 ? matrix[currentRow][currentColumn - 1] : Integer.MAX_VALUE;
  }

  protected int getRightValue(int[][] matrix, int currentRow, int currentColumn) {
    return currentColumn + 1 < matrix[currentRow].length ? matrix[currentRow][currentColumn + 1] : Integer.MAX_VALUE;
  }

  protected int getTopValue(int[][] matrix, int currentRow, int currentColumn) {
    return currentRow > 0 ? matrix[currentRow - 1][currentColumn] : Integer.MAX_VALUE;
  }

  protected int getBottomValue(int[][] matrix, int currentRow, int currentColumn) {
    return currentRow + 1 < matrix[currentRow].length ? matrix[currentRow + 1][currentColumn] : Integer.MAX_VALUE;
  }

}
