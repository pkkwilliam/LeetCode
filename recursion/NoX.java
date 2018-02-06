/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

*/

public class NoX{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "xaxb","abc","xx"
        };
        for(String s : input)
            System.out.println(solution.noX(s));
    }
}
class Solution{
    public String noX(String str) {
        if(str.length() < 1)
            return "";
        return "" + ((str.charAt(0) == 'x') ? "" : str.charAt(0)) + noX(str.substring(1));
    }
}