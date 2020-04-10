package leetcode;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example 1:

 Input: "babad"
 Output: "bab"
 Note: "aba" is also a valid answer.
 Example 2:

 Input: "cbbd"
 Output: "bb"
 */

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = s.length();
        int currentIndex = 0;
        String currentLongest = "";
        while (currentIndex < length) {
            final int sameEnd = getSameEnd(currentIndex, s);
            final String current = checkLeftAndRight(currentIndex, sameEnd + 1, s);
            if (current.length() > currentLongest.length()) {
                currentLongest = current;
            }
            currentIndex++;
        }
        return currentLongest;
    }

    protected String checkLeftAndRight(int start, int end, String s) {
        int currentLeft = start - 1, currentRight = end;
        String current = s.substring(start, end);
        while (currentLeft >= 0 && currentRight < s.length()) {
            if (s.charAt(currentLeft) == s.charAt(currentRight)) {
                current = s.substring(currentLeft, currentRight + 1);
                currentLeft--;
                currentRight++;
            } else {
                break;
            }
        }
        return current;
    }

    protected int getSameEnd(int index, String s) {
        char currentChar = s.charAt(index);
        while (index + 1 < s.length() && currentChar == s.charAt(index + 1)) {
            index++;
        }
        return index;
    }

}
