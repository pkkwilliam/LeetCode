// Problem 409
// Longest Palindrome
import java.util.LinkedList;

public class problem{
	public static void main(String[]args){
		Solution solution = new Solution();
		String input1 = "abccccdd";
		String input2 = "abBcccCdd";
		String input3 = "";
		String input4 = null;
		String input5 = "llpp22nnfhfhfhfkj1";
		String [] totalInput = {input1,input2,input3,input4,input5};
		for(String i : totalInput){
			int result = solution.longestPalindrome(i);
			System.out.println(result);
		}
	}
}
class Solution {
    public int longestPalindrome(String s) {
    	LinkedList<Character> list = new LinkedList<Character>();
    	int count = 0;

    	if(s == null)
    		return 0;

    	for(int i = 0; i < s.length(); i++){
    		if(list.contains(s.charAt(i))){
    			count++;
    			list.remove(Character.valueOf(s.charAt(i)));
    		}else
    			list.add(s.charAt(i));
    	}
    	count*=2;
    	if(list.size() > 0)
    		count++;
    	return count;
    }
}