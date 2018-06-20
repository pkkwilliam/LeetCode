/*
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.

Note:

All numbers will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: k = 3, n = 7
Output: [[1,2,4]]
Example 2:

Input: k = 3, n = 9
Output: [[1,2,6], [1,3,5], [2,3,4]]
 */
package problem216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[]args){

    }
}
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int localCount = 0;
        loop:
        while(localCount < 9){
            int localSum = 0;

            if(localSum == n)
            localCount++;
        }
        return result;
    }
}