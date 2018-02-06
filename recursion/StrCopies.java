/*

Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.


strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/

public class StrCopies{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "cat","cow","cow"
        };
        int[] number = {2,2,1};
        for(int i = 0; i < input.length; i++)
            System.out.println(solution.strCopies("catcowcat", input[i], number[i]));
    }
}
class Solution{
    public boolean strCopies(String str, String sub, int n) {
        if(str.length() < sub.length())
            return (n > 0) ? false : true;
        String temp = str.substring(0, sub.length());
        return (temp.equals(sub)) ? 
            strCopies(str.substring(1), sub, n - 1) :
                strCopies(str.substring(1), sub, n); 
    }
}
