// Problem 9
// Palindrome Number
public class PalindromeNumber{
	public static void main(String[]args){
		Solution solution = new Solution();
		boolean result = solution.isPalindrome(12123221);
		System.out.println(result);
	}
}
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x > Integer.MAX_VALUE)
        	return false;
        else{
        	int newInt = 0;
        	int workInt = x;
        	while(workInt != 0){
        		newInt *= 10;
        		newInt += workInt % 10;
        		workInt /= 10;
        	}
        	System.out.println(newInt);
        	if(newInt == x)
        		return true;
        	else
        		return false;
        }
    }
}