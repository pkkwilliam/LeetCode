/*
Given a string, compute recursively (no loops) 
a new string where all the lowercase 'x' chars have been changed to 'y' chars.


changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

*/

public class ChangeXY{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "codex","xxhixx","xhihix"
        };
        for(String s : input)
            System.out.println(solution.changeXY(s));
    }
}
class Solution{
    public String changeXY(String str) {
        if(str.length() == 0)
            return "";
        return "" + ((str.charAt(0) == 'x') ? "y" : str.charAt(0)) + changeXY(str.substring(1));
    }
}