/*

Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
*/

public class EndX{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "xxre","xxhixx","xhixhix",""
        };
        for(String s : input)
            System.out.println(solution.endX(s));
    }
}
class Solution{
    public String endX(String str) {
        if(str.length() < 1)
            return "";
        return (str.charAt(0) == 'x') ? 
            endX(str.substring(1)) + "x" :
                str.charAt(0) + endX(str.substring(1));
    }
}
