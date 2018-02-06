/*

Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public class Count11{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "11abc11","abc11x11x11","111","","ababc","ab"
        };
        for(String s : input)
            System.out.println(solution.count11(s));
    }
}
class Solution{
    public int count11(String str) {
        if(str.length() < 2)
            return 0;
        return (str.charAt(0) == '1' && str.charAt(1) == '1') ?
            1 + count11(str.substring(2)) :
                count11(str.substring(1));
    }
}
