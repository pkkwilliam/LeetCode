/*
Given a string, compute recursively (no loops) 
a new string where all appearances of "pi" have been replaced by "3.14".


changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

*/

public class ChangePi{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "xpix","pipi","pip"
        };
        for(String s : input)
            System.out.println(solution.changePi(s));
    }
}
class Solution{
    public String changePi(String str) {
        if(str.length() < 1)
            return "";
        return "" + ((str.charAt(0) == 'p' &&  str.length() > 1 && str.charAt(1) == 'i') ? 
            "3.14" + changePi(str.substring(2)) : str.charAt(0) + changePi(str.substring(1)));
    }
}