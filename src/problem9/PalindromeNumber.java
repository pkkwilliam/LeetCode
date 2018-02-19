/*
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
package problem9;

public class PalindromeNumber {
    public static void main(String[]args){
        int[] input = {
                12321,1,515,67,11,23,232,0,1000021,10001
        };
        for(int i : input)
            System.out.println(new Solution().isPalindrome(i));
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x > Integer.MAX_VALUE)
            return false;
        int workInt = x, checkInt = 0;
        while(workInt > 0){
            checkInt = checkInt * 10 + workInt % 10;
            workInt /= 10;
        }
        return (checkInt == x) ? true : false;
    }
}