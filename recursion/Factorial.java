/*
Given n of 1 or more, return the factorial of n,
which is n * (n-1) * (n-2) ... 1.
Compute the result recursively (without loops).

factorial(1) → 1
factorial(2) → 2
factorial(3) → 6
*/
public class Factorial{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {0,1,2,3,5,6,7,8,9,10};
        for(int i : input)
            System.out.println(solution.factorial(i));
    }
}
class Solution{
    public int factorial(int n){
        if(n < 2)
            return n;
        else
            return n * factorial(n - 1);
    }
}