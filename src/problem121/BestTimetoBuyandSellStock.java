/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

package problem121;

public class BestTimetoBuyandSellStock {
    public static void main(String[]args){
        int[][] input = {
                {7,1,5,3,6,4},
                {7,6,4,3,1},
                {1,2,3,4,5},
                {0},
                {},
                {7,6,5,4,3,2,1},
                {2,4,1},
                {Integer.MIN_VALUE, Integer.MAX_VALUE}
        };
        for(int[] i : input)
            System.out.println(new Solution().maxProfit(i));
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, max = Integer.MIN_VALUE;
        for(int i = prices.length - 1; i >= 0; i--){
            int current = prices[i];
            if(current > max)
                max = current;
            if(max - current > profit)
                profit = max - current;
        }
        return profit;
    }
}