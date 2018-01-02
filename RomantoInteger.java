/* 
Problem 13
Roman to Integer
Understading the order of the symbol is important
IV and VI is 4 and 6
(VI)reading from bank to forth, we can add I then V 1+5
(IV) but if I appear after V we can do 5 - 1 since this is the order
how it can appear.
ADD more corresponding value and symbol at line 22, 23 if needed.
*/
public class RomantoInteger{
    public static void main(String[]args){
        Solution solution = new Solution();
        //System.out.println("Please enter a positive integer less than 4000");
        //int input = scan.nextInt();
        int result = solution.romanToInt("DCXXI");
        System.out.println(result);
    }
}
class Solution {
    public int romanToInt(String s) {
        char order [] = {'M','D','C','L','X','V','I'};
        int value [] = {1000,500,100,50,10,5,1};
        int result = 0;
        int currentSymbol = order.length;

        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = 0; j < order.length; j++){
                if(s.charAt(i) == order[j]){
                    if(currentSymbol >= j)
                        result += value[j];
                    else
                        result -= value[j];
                    currentSymbol = j;
                }
            }           
        }
        return result;
    }
}