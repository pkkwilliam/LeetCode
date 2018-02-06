/*
Given a string, 
compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

public class CountX{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "xxhixx","xhixhix","hi"
        };
        for(String s : input)
            System.out.println(solution.countX(s));
        // an empty string = "";
        System.out.println("x".substring(1));
    }
}
class Solution{
    public int countX(String str) {
        if(str.length() == 0)
            return 0;
        return (str.charAt(0) == 'x') ?
                1 + countX(str.substring(1)) : 
                    0 + countX(str.substring(1));
    }
}