package problem17;
/*
Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

import java.util.List;
import java.util.ArrayList;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[]args){
        String[] input = {
              "23"
        };
    }
}
class Solution {
    List<String> list = new ArrayList<>();
    public void letterCombinations(String digits) {
        String[] keys = {
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

    }
    private String revursionHelper(String...s){
        return s[1];
    }
}