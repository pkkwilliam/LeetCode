/*

Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"

*/

public class PairStar{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "hello","xxyy","aaaa",""
        };
        for(String s : input)
            System.out.println(solution.pairStar(s));
    }
}
class Solution{
    public String pairStar(String str) {
        if(str.length() < 2)
            return str;
        return "" + ((str.charAt(0) == str.charAt(1)) ? str.charAt(0)+"*" : str.charAt(0))
         + pairStar(str.substring(1));
    }
}
