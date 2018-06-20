package problem258;

/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 */

public class AddDigits {
    public static void main(String[]args){
        int[] input = {
                38,9,18,0,256
        };
        for(int i : input)
            System.out.println(new Solution().addDigits(i));
    }
}
class Solution {
    public int addDigits(int num) {
        return (num % 9 != 0) ? num % 9 : (num == 0) ? 0 : 9;
    }
}