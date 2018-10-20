package leetcode;

/**
 * 221. Maximal Square
 *
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 Example:

 Input:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0

 Output: 4
 */

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == '1') {
                    int localResult = localCheck(matrix, i, j);
                    result = localResult > result ? localResult : result;
                }
            }
        }
        return result;
    }
    private int localCheck(char[][] matrix, int i, int j){
        int currentSquare = 1, x_maximum = 1, y_maximum = 1;

        return currentSquare * currentSquare;
    }
    public int maximalSquareExample(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[][] dp = new int[rows + 1][cols + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;
    }
    public int getMaximumConnection(char[][]matrix, int x, int y){
        if(x < 0 || y < 0 || x >= matrix.length || y >= matrix[x].length)
            return 0;
        if(matrix[x][y] == '0' || matrix[x][y] == '2')
            return 0;
        matrix[x][y] = '2';
        int up = getMaximumConnection(matrix, x, y - 1);
        int down = getMaximumConnection(matrix, x, y + 1);
        int left = getMaximumConnection(matrix, x - 1 , y);
        int right = getMaximumConnection(matrix, x + 1, y);
        return 1 + up + down + left + right;
    }
}