/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
package leetcode;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[]args){
        String input[] = {
                "abcabcbb","bbbbb","pwwkew","","abcda","a",""
        };
        for(String s : input)
            System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }
}
class Solution3 {
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
    private String manacherAlgorithms(char[] input){
        int R = 0, C = 0;
        int[] count = new int[input.length];
        for(int i = 0; i < input.length; i++){
            int start;
            if(i >= R) {
                start = 1;
                count[i] = 1;
            }
            else{
                start = (R - i < count[i - (i - C) * 2]) ? R - i : count[i - (i - C) * 2];
                count[i] = start * 2  - 1;
            }
            while(i - start > -1 && i + start < input.length){
                if(input[i-start] == input[i+start]){
                    if(i+start > R) {
                        R = i + start;
                        C = i;
                    }
                    start++;
                    count[i] += 2;
                }
                else{
                    break;
                }
            }
        }

        int longestIndex = 0, longest = 0;
        for(int i = 0; i < count.length; i++) {
            if (count[i] > longest) {
                longest = count[i];
                longestIndex = i;
            }
        }
        for(int i : count)
            System.out.print(i+" ");
        for(char c : input)
            System.out.print(c+" ");
        int start = longestIndex - longest / 2;
        System.out.println("Start: "+start+" end: "+(start+longest)+" Index = "+longestIndex+" Longest = "+longest);
        String result = "";
        for(int i = start; i < start + longest - 1; i++)
            if(input[i] != '#')
                result += String.valueOf(input[i]);
        return result;
    }
}