package leetcode;

/**
 *  Author: Ka Kei Pun
 *  Date: 10/19/2018
 *  Version: 1.0.0
 *
 * 66. Plus One
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 */

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int currentDigit = digits.length - 1;
        digits[currentDigit] += 1;
        if(digits[currentDigit] < 10){
            return digits;
        }
        while(digits[currentDigit] > 9){
            if(currentDigit == 0){
                int[] largeArray = new int[digits.length + 1];
                largeArray[0] = 1;
                return largeArray;
            }
            digits[currentDigit] = 0;
            digits[currentDigit - 1] += 1;
            currentDigit--;
        }
        return digits;
    }
}
