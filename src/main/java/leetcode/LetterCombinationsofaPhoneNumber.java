package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
Note:

Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

public class LetterCombinationsofaPhoneNumber {

  private static String[][] DIGIT_CHARACTER = {
          {"a", "b", "c"},
          {"d", "e", "f"},
          {"g", "h", "i"},
          {"j", "k", "l"},
          {"m", "n", "o"},
          {"p", "q", "r", "s"},
          {"t", "u", "v"},
          {"w", "x", "y", "z"}
  };

  public List<String> letterCombinations(String digits) {
    final String[][] input = convertDigitToString(digits);
    final List<String> result = new ArrayList<>();
    recursionHelper(result,  input, 0, "");
    return result;
  }

  protected void recursionHelper(List<String> result, String[][] input, int currentRow, String parentString) {
    if (currentRow > input.length - 1) {
      return;
    } else if (currentRow != input.length - 1) {
      for (int i = 0; i < input[currentRow].length; i++) {
        recursionHelper(result, input, currentRow + 1,  parentString + input[currentRow][i]);
      }
    } else {
      for (int i = 0; i < input[currentRow].length; i++) {
        result.add(parentString + input[currentRow][i]);
      }
      return;
    }
  }


  protected String[][] convertDigitToString(String digit) {
    final String[][] characters = new String[digit.length()][];
    for (int i = 0; i < digit.length(); i++) {
      characters[i] = DIGIT_CHARACTER[digit.charAt(i) - 48 - 1 - 1];
    }
    return characters;
  }

}
