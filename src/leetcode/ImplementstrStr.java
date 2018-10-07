/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
package leetcode;

public class ImplementstrStr {
    public static void main(String[]args){
        String[] input1 = {"hello","","aasdf","","aaaaaaa","aaa","mississippi","mississippi"};
        String[] input2 = {"ll","l","","","bba","aaaa","issip","issi"};
        for(int i = 0; i < input1.length; i++)
            System.out.println(new Solution28().strStr(input1[i],input2[i]));
    }
}
class Solution28 {
    public int strStr(String haystack, String needle) {
        loop:
        for(int i = 0; i < haystack.length(); i++){
            int localIndex = i;
            for(int j = 0; j < needle.length(); j++){
                if(i < haystack.length() && haystack.charAt(i) == needle.charAt(j)){
                    i++;
                }else{
                    i = localIndex;
                    continue loop;
                }
            }
            return localIndex;
        }
        return (needle.length() == 0) ? 0 : -1;
    }
    public int strStr2(String haystack, String needle){
        return haystack.indexOf(needle);
    }
}