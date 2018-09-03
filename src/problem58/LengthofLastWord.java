package problem58;

public class LengthofLastWord {
    public static void main(String[]args){
        String[] input = {
                "hi",
                "hi, hi",
                " ",
                "",
                "     "
        };
        for(String s : input)
            System.out.println(new Solution().lengthOfLastWord2(s));
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
    public int lengthOfLastWord2(String s){
        String[] result = s.split(" ");
        return s.length() > 2 && result.length > 1 ? result[result.length - 1].length() : 0;
    }
}