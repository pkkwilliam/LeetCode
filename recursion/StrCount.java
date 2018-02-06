/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.


strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/

public class StrCount{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "cat","cow","dog"
        };
        for(String s : input)
            System.out.println(solution.strCount("catcowcat", s));
    }
}
class Solution{
    public int strCount(String str, String sub) {
        if(str.length() < sub.length())
            return 0;
        String temp = str.substring(0, sub.length());
        return (temp.equals(sub)) ? 
            1 + strCount(str.substring(sub.length()), sub) : 
                strCount(str.substring(1), sub);
    }
}
