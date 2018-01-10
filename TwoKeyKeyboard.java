// Problem 650
// 2 Keys Keyboard

public class TwoKeyKeyboard{
	public static void main(String[]args){
        Solution solution = new Solution();
        int input [] = {3,9,6,36};
        for(int i : input)
        System.out.println(solution.minSteps(i));
	}
}
class Solution {
    public int minSteps(int n) {
    	int count = 0;
    	for(int i = 2; i <= n; i++){
    		while(n % i == 0){
    			count += i;
    			n /= i;
    		}
    	}
    	return count + n - 1;
    }
}