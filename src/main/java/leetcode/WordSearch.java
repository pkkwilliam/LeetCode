package leetcode;

/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 */

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        if(board.length * board[0].length < word.length())
            return false;
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                if(recursion_helper(board, word, i, j))
                    return true;
        return false;

    }
    private boolean recursion_helper(char[][] board, String word, int x, int y){
        if(x == board.length || x < 0 || y == board[x].length || y < 0)
            return false;
        if(word.length() == 1 && board[x][y] == word.charAt(0))
            return true;
        else if(word.charAt(0) != board[x][y])
            return false;
        board[x][y] = '-';
        // up
        if(recursion_helper(board, word.substring(1), x, y - 1))
            return true;
        // down
        else if(recursion_helper(board, word.substring(1), x, y + 1))
            return true;
        // left
        else if(recursion_helper(board, word.substring(1), x - 1, y))
            return true;
        // right
        else if (recursion_helper(board, word.substring(1), x + 1, y))
            return true;
        return false;
    }
}