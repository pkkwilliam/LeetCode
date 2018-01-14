// Problem 415
// Add Strings
public class AddString{
	public static void main(String[]args){
		Solution solution = new Solution();
        String input1 [] = {"1","27987","98","0","6913259244","9333852702227987"};
        String input2 [] = {"939","4263","9","0","71103343","85731737104263"};
        //String input1 [] = {"1"};
        //String input2[] = {"999"};
        for(int i = 0; i < input1.length; i++)
            System.out.println(solution.addStrings(input1[i],input2[i])); 
	}
}
class Solution {
    public String addStrings(String num1, String num2) {
    	StringBuilder result = new StringBuilder();
    	int ASCII = 48;
    	int carry = 0;
    	for(int i = num1.length() - 1, j = num2.length() - 1;
    			i >= 0 || j >= 0; i--,j--){
    		int number1 = (i >= 0) ? num1.charAt(i) - ASCII : 0;
    		int number2 = (j >= 0) ? num2.charAt(j) - ASCII : 0;
    		result.insert(0, (number1+number2+carry) % 10);
    		carry = (number1+number2+carry) / 10;
    		//System.out.println("Num1: "+number1+" Num2: "+number2+"Carry: "+carry+" append: "+(number1+number2) % 10);
    	}
    	return (carry == 0) ? result.toString() : result.insert(0, carry).toString();
    }
}