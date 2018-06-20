package problem200;

public class NumberOfIsland {
    public static void main(String[]args){
        char[][][] input = {

                {{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}},

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
        for(char[][] i : input)
            System.out.println(new Solution().numIslands(i));
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++)
                if(grid[i][j] == '1'){
                    count++;
                    reucrsion_helper(grid, i, j);
                }

        return count;
    }
    private void reucrsion_helper(char[][]grid, int x, int y){
        if(x > grid.length - 1 || x < 0 || y > grid[x].length - 1|| y < 0 || grid[x][y] != '1')
            return;
        grid[x][y] = '0';
        // up
        reucrsion_helper(grid, x , y-1);
        // down
        reucrsion_helper(grid, x , y+1);
        // left
        reucrsion_helper(grid, x-1 , y);
        // right
        reucrsion_helper(grid, x+1 , y);
    }
}