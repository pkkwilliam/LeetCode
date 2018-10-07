package leetcode;

public class MaxAreaOfIsland {
    public static void main(String[]args){
        int[][][] input = {

                {{1,1,1,1,0},
                        {1,1,0,1,0},
                        {1,1,0,0,0},
                        {0,0,0,0,0}},

                {{1,1,0,0,0},
                        {1,1,0,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,1}},

                {{0,0,0,0,0},
                        {0,1,0,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,1}},

                {{0}},

                {{1}},

                {{}},

                {{1,0,1}},


        };
        for(int[][] i : input)
            System.out.println(new Solution695().maxAreaOfIsland(i));
    }
}
class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                if(grid[i][j] == 1){
                    int local_result = recursion_helper(grid, i, j);
                    result = (local_result > result) ? local_result : result;
                }
        return result;
    }
    private int recursion_helper(int[][] grid, int x, int y){
        if(x < 0 || x > grid.length - 1 || y < 0 || y > grid[x].length - 1 || grid[x][y] != 1)
            return 0;
        grid[x][y] = 0;
        int up = recursion_helper(grid, x, y - 1);
        int down = recursion_helper(grid, x, y + 1);
        int left = recursion_helper(grid, x - 1, y);
        int right = recursion_helper(grid, x + 1, y);
        return 1 + up + down + left + right;
    }
}