/*
Given a string, 
compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

public class CountHi{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "xxhixx","xhixhix","hi"
        };
        for(String s : input)
            System.out.println(solution.countHi(s));
    }
}
class Solution{
    public int countHi(String str) {
        if(str.length() < 2)
            return 0;
        else
            return (str.charAt(0) == 'h' && str.charAt(1) == 'i') ? 
                1 + countHi(str.substring(2)) : 
                0 + countHi(str.substring(1));
    }
}