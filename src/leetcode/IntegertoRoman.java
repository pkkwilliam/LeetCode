package leetcode;
/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.

	String symbol [] [] = {
    		{"","I","II","III","IV","V","VI","VII","VIII","IX"}, // Onces
    		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}, // Tenths
    		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}, // Hundreds
    		{"","M","MM","MMM","MMMM"}// Thousands
    		};

 */
public class IntegertoRoman {
    public static void main(String[]args){
        int[] input = {1,3999,50,51,3884};
        for(int i : input)
            System.out.println(new Solution12().intToRoman(i));
    }
}
class Solution12 {
    public String intToRoman(int num) {
        if(num < 1 || num > 3999)
            return "";
        String symbol [] [] = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"}, // Onces
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}, // Tenths
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}, // Hundreds
                {"","M","MM","MMM","MMMM"}// Thousands
        };
        String result = "";
        int count = symbol.length - 1;
        while(count > -1){
            int calculateExp = (int)Math.pow(10, count);
            result += symbol[count][num / calculateExp];
            num = num % calculateExp;
            count--;
        }
        return result;
    }
}