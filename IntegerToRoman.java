// Problem 12
// Integer to Roman
// Postitive integer less than 4000

import java.util.Scanner;
public class IntegerToRoman{
	public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
		Solution solution = new Solution();
        System.out.println("Please enter a positive integer less than 4000");
        int input = scan.nextInt();
		String result = solution.intToRoman(input);
		System.out.println(result);
	}
}
class Solution {
    public String intToRoman(int num) {
    	if(num < 0 || num > 3999)
    		return "";
    	else{
    		String symbol [] [] = {
    		{"","I","II","III","IV","V","VI","VII","VIII","IX"}, // Onces
    		{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}, // Tenths
    		{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}, // Hundreds
    		{"","M","MM","MMM","MMMM"}// Thousands
    		};
    	String result = "";
    	int highestValue = 1000;
    	int digit = 3;
    	while(num != 0){
    		int value = num / highestValue;
    		num %= highestValue;
    		highestValue /= 10;
    		result += symbol[digit][value];	
    		digit--;
    	}
    	return result;
    	}
    }
}