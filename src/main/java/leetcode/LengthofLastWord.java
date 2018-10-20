package leetcode;

public class LengthofLastWord {
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