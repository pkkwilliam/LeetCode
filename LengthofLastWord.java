// Problem 58
// Length of Last Word
import java.util.List;
import java.util.ArrayList;

public class LengthofLastWord{
    public static void main(String[]args){
        Solution solution = new Solution();
        String[] input = {
            "Hello World",
            "",
            " ",
            "HIdasfsda ",
            "a "
        };
        for(String s : input)
            System.out.println(solution.lengthOfLastWord(s));
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length() -1; i > -1; i--){
            if(s.charAt(i) != ' ')
                count++;
            else if(count != 0)
                break;
        }
        return count;
    }
}