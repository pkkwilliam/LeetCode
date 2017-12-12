// Problem 5
// Longest Palindromic Substring
public class problem{
	public static void main(String[]args){
		Solution solution = new Solution();
		String input1 = "babad";
		String input2 = "cbbd";
		String result = solution.longestPalindrome(input1);
		System.out.println(result);
	}
}
class Solution{
	public String longestPalindrome(String s) {
		String processedString = "";
		for(int i = 0; i < s.length(); i++){
			processedString += s.substring(i, i + 1)+"|";
		}
		processedString = processedString.substring(0,processedString.length() - 1);
        String result = "";

       	return processedString;
    }
}