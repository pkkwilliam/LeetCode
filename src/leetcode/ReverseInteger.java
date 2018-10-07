/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


 */

package leetcode;

public class ReverseInteger {
    public static void main(String[]args){
        int[] input = {
                123,-123, 120, -1000, 1000,0,1534236469,-2147483648
        };
        for(int i : input)
            System.out.println(new Solution7().reverse(i));
    }
}
class Solution7 {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE)
            return 0;
        long result = 0;
        int isNegative = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        while(x > 0){
            result = result * 10 + x % 10;
            x /= 10;
        }
        if(result > Integer.MAX_VALUE)
            return 0;
        //System.out.print("-? "+isNegative+" ");
        return (int) (result * isNegative);
    }
}