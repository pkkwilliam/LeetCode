package leetcode;
/*
Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static void main(String[]args){
        String[] input = {
                "",
                "Le",
                "Le"
        };
            System.out.println(new Solution14().longestCommonPrefix(input));
    }
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length < 1)
            return "";
        int shortest = Integer.MAX_VALUE;
        for(String s : strs)
            if(s.length() < shortest)
                shortest = s.length();

        int index = 0;
        String result ="";
        loop:
        while(index < shortest){
            char c = strs[0].charAt(index);
            for(int i = 1; i < strs.length; i++){
                if(c != strs[i].charAt(index))
                    break loop;
            }
            index++;
            result += c;
        }
        return result;
    }
    public String longestCommonPrefixRecursion(String[] strs) {
        if(strs.length < 1)
            return "";
        int shortest = Integer.MAX_VALUE;
        for(String s : strs)
            if(s.length() < shortest)
                shortest = s.length();
        return recursionHelper(strs, shortest);
    }
    private String recursionHelper(String[] strs, int count){
        if(count == 0)
            return "";
        for(int i = 0; i < strs.length - 1; i++)
            if(strs[i].charAt(0) != strs[i+1].charAt(0))
                return "";

        String[] recusionString = new String[strs.length];
        for(int j = 0; j < recusionString.length; j++)
            recusionString[j] = strs[j].substring(1, count);
        return strs[0].charAt(0) + recursionHelper(recusionString, count - 1);
    }
}
