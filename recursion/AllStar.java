/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

*/

public class AllStar{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "hello","abc","ab",""
        };
        for(String s : input)
            System.out.println(solution.allStar(s));
    }
}
class Solution{
    public String allStar(String str) {
        if(str.length() < 2)
            return str;
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}
