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
package problem5;

public class LongestPalindromicSubstring {
    public static void main(String[]args){
        String[] input = {
                "babad", "cbbd"
        };
        for(String s : input)
            System.out.println(new Solution().brutal(s));
    }
}
class Solution {
    public String longestPalindrome(String s) {
        return "";
    }
    public String brutal(String s){
        int start, end;
        for(int i = 0; i < s.length(); i++){

        }
        return "";
    }
}
