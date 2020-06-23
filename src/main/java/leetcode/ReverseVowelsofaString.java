package leetcode;

/** Author: Ka Kei Pun Date: 6/23/20 Version: 1.0.0 */

/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
 */

public class ReverseVowelsofaString {

  public String reverseVowels(String s) {
    return twoPointer(s);
  }

  protected String twoPointer(String input) {
    char[] charArray = input.toCharArray();
    int leftIndex = 0;
    int rightIndex = input.length() - 1;
    while (leftIndex < rightIndex) {
      leftIndex = getLeftIndex(charArray, leftIndex);
      rightIndex = getRightIndex(charArray, rightIndex);
      if (leftIndex < rightIndex) {
        char tempChar = charArray[leftIndex];
        charArray[leftIndex] = charArray[rightIndex];
        charArray[rightIndex] = tempChar;
        leftIndex++;
        rightIndex--;
      }
    }
    return String.copyValueOf(charArray);
  }

  private int getLeftIndex(char[] charArray, int currentIndex) {
    while (currentIndex < charArray.length - 1) {
      if (isVowels(charArray[currentIndex])) {
        return currentIndex;
      }
      currentIndex++;
    }
    return currentIndex;
  }

  private int getRightIndex(char[] charArray, int currentIndex) {
    while (currentIndex >= 0) {
      if (isVowels(charArray[currentIndex])) {
        return currentIndex;
      }
      currentIndex--;
    }
    return currentIndex;
  }

  private boolean isVowels(char c) {
    switch (c) {
      case 'a':
        return true;
      case 'A':
        return true;
      case 'e':
        return true;
      case 'E':
        return true;
      case 'i':
        return true;
      case 'I':
        return true;
      case 'o':
        return true;
      case 'O':
        return true;
      case 'u':
        return true;
      case 'U':
        return true;
      default:
        return false;
    }
  }
}
