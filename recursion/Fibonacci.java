/*
The fibonacci sequence is a famous bit of mathematics, 
and it happens to have a recursive definition. 
The first two values in the sequence are 0 and 1 (essentially 2 base cases). 
Each subsequent value is the sum of the previous two values, 
so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. 
Define a recursive fibonacci(n) method that returns the nth fibonacci number, 
with n=0 representing the start of the sequence.

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
*/

public class Fibonacci{
    public static void main(String[]args){
        Solution solution = new Solution();
        int[] input = {0,1,2,3,5,6,7,8,9,10};
        for(int i : input)
            System.out.println(solution.fibonacci(i));
    }
}
class Solution{
    public int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n < 3)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}