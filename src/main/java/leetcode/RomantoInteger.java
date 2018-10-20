package leetcode;
/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

        char order [] = {'M','D','C','L','X','V','I'};
        int value [] = {1000,500,100,50,10,5,1};
    	String symbol [] [] = {
    		{"","I","II","III","IV","V","VI","VII","VIII","IX"}, // Onces
    		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}, // Tenths
    		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}, // Hundreds
    		{"","M","MM","MMM","MMMM"}// Thousands
    		};
 */

public class RomantoInteger {
    public int romanToInt(String s) {
        char order [] = {'M','D','C','L','X','V','I'};
        int value [] = {1000,500,100,50,10,5,1};
        int currentIndex = order.length, sum = 0;
        for(int i = s.length() - 1; i > -1; i--){
            for(int j = 0; j < order.length; j++){
                if(s.charAt(i) == order[j]){
                    if(j <= currentIndex)
                        sum += value[j];
                    else
                        sum -= value[j];
                    currentIndex = j;
                }
            }
        }
    return sum;
    }
}
