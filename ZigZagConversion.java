// Problem 6
// ZigZag Conversion
import java.util.Arrays;
public class ZigZagConversion{
    public static void main(String[]args){
        Solution solution = new Solution();
        String [] input = {
            "PAYPALISHIRING",
            "ABC",
            "A",
            "B",
            "",
            "",
            "haha",
            "AB"
        };
        int [] row = {
            3,2,3,1,5,0,0,1
        };
        for(int i = 0; i < input.length; i++){
            System.out.println(solution.convert(input[i],row[i]));
        }
    }
}
class Solution {
    public String convert(String s, int numRows) {
        String [] rows = new String[numRows];
        if(numRows < 2) return s;
        Arrays.fill(rows,"");
        boolean touchBottom = false;
        int rowNumber = -1;
        for(int i = 0; i < s.length(); i++){

            if(rowNumber == numRows - 1)
                touchBottom = true;
            else if(rowNumber == 0)
                touchBottom = false;
            if(touchBottom)
                rowNumber--;
            else
                rowNumber++;
            rows[rowNumber] += s.charAt(i);
        }
        String result = "";
        for(String i : rows)
            result += i;
        return result;
    }
}