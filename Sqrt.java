// Problem 69
// Sqrt(x)

public class Sqrt{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {
            4,7,Integer.MAX_VALUE
        };
        for(int i : input)
            System.out.println(solution.mySqrt(i));
    }
}
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}