/*

Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public class CountAbc{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "11abc11","abc11x11x11","111","","ababc","ab"
        };
        for(String s : input)
            System.out.println(solution.countAbc(s));
    }
}
class Solution{
    public int countAbc(String str) {
        if(str.length() < 3)
            return 0;
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
            if(str.charAt(2) == 'a')
                return 1 + countAbc(str.substring(1));
            else if(str.charAt(2) == 'c')
                return 1 + countAbc(str.substring(3));
        }
        return 0 + countAbc(str.substring(1));
    }
}
