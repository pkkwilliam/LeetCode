// Problem 7
// Reverse Integer

public class ReverseInteger{
    public static void main(String[]args){
        Solution solution = new Solution();
        //int result = solution.reverse(-2147483648);
        int result = solution.reverse(-2147483648);
        System.out.println(result);
        int x = 1234567890;
    }
}
class Solution {
    public int reverse(int x) {
        long result = 0;
        int isNegative = 1;
        if(x < 0){
            x *= -1;
            isNegative *= -1;
        }
        while(x != 0){
            result *= 10;
            result += (x % 10);
            x /= 10;
            if(result > 2147483647 || result < -2147483648)
                return 0;
        }
        return (int) (result *= isNegative);
    }
}
