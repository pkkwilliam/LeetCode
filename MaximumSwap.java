// Problem 670
// Maximum Swap

public class MaximumSwap{
	public static void main(String[]args){
		Solution solution = new Solution();
		int input = 99246;
		int result = solution.maximumSwap(input);
		System.out.println(result);
	}
}
class Solution{
	public int maximumSwap(int num) {
		char [] charNum = (num+"").toCharArray();
		boolean didSwap = false;
		int largestSpot = 0;
		int shouldSwap = 0;

		loop:
		for(int i = 0; i < charNum.length; i++){
			int compareIndex = i;
			for(int j = charNum.length - 1; j > i; j--){
				if(charNum[j] > charNum[compareIndex]){
					System.out.println(i+" "+j);
					didSwap = true;
					compareIndex = j;
					largestSpot = j;
				}
			}
			if(didSwap == true){
				shouldSwap = i;
				break loop;
			}
		}
		// Swap
		char temp = charNum[shouldSwap];
		charNum[shouldSwap] = charNum[largestSpot];
		charNum[largestSpot] = temp;
		// Convert to int and return
		String result = "";
		for(char c : charNum)
			result += c;
		return Integer.valueOf(result);
	}
}