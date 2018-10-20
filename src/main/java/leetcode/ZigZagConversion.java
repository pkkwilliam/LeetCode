package leetcode;

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

import java.util.Arrays;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        String[] rows = new String[numRows];
        Arrays.fill(rows,"");
        int currentRow = 0;
        boolean isDown = true;
        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            rows[currentRow] += currentChar;
            if(currentRow == numRows - 1)
                isDown = false;
            else if(currentRow == 0)
                isDown = true;
            currentRow = (isDown == true) ? currentRow + 1 : currentRow - 1;
        }
        String result = "";
        for(String string : rows)
            result += string;
        return result;
    }
}