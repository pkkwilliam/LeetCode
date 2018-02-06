/*

Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
*/

public class StringClean{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "yyzzza","abbbcdd","Hello","","ababc","ab"
        };
        for(String s : input)
            System.out.println(solution.stringClean(s));
    }
}
class Solution{
    public String stringClean(String str) {
        if(str.length() < 2)
            return str;
        return (str.length() > 1 && str.charAt(0) == str.charAt(1)) ? 
            stringClean(str.substring(1)) : 
                str.charAt(0) + stringClean(str.substring(1));
    }
}
