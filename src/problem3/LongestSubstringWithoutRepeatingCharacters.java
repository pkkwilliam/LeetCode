/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package problem3;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[]args){
        String input[] = {
                "abcabcbb","bbbbb","pwwkew","","abcda","a"
        };
        for(String s : input)
            System.out.println(new Solution().lengthOfLongestSubstring(s));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int longest = 0, localCount = 0;
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(map.get(current) == null){
                map.put(current, i);
                localCount++;
            }
            else{
                longest = (localCount > longest) ? localCount : longest;
                map.remove(current);
                localCount = localCount - 1;
                map.clear();
            }
        }
        longest = (localCount > longest) ? localCount : longest;
        return longest;
    }
}