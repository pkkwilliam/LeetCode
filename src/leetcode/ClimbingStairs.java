/*
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

package leetcode;

public class ClimbingStairs {
    public static void main(String[]args){
        int[] input = {0,1,2,3,4,5,6,7,8,9,44};
        for(int i : input)
            System.out.println(new Solution70().climbStairs(i));
    }
}
class Solution70 {
    public int climbStairs(int n){
        if(n < 3)
            return (n >= 0) ? n : 0;
        int a = 1, b = 2;
        for(int i = 3; i < n; i++){
            b += a;
            a = b - a;
        }
        return a + b;
    }
    public int climbStairsRecursion(int n) {
        if(n < 1)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        int m1 = climbStairsRecursion(n - 1);
        int m2 = climbStairsRecursion(n - 2);
        return m1 + m2;
    }
}