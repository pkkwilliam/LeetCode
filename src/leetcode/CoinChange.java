/**
 *  Name: Ka Kei Pun
 *  Date: 08/06/2018
 *
 * 322. Coin Change
 *
 *  You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

 Example 1:

 Input: coins = [1, 2, 5], amount = 11
 Output: 3
 Explanation: 11 = 5 + 5 + 1
 Example 2:

 Input: coins = [2], amount = 3
 Output: -1
 Note:
 You may assume that you have an infinite number of each kind of coin.
 */
// TO-DO
package leetcode;

import java.util.*;

public class CoinChange {
    public static void main(String[]args){
        int[][] input = {
            {1,2,5},
            {1,2,5,9},
            {2,3}
        };
        int[] amount = {
                11,
                7,
                4
        };
        for(int i = 0; i < input.length; i++)
            System.out.println("Return "+new Solution322().coinChange(input[i],amount[i]));
    }
}
class Solution322 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] solution = new int[amount];
        for(int i = 0 ; i < solution.length; i++){
            int currentAmount = 0, numberOfCoin = 0;
            for(int j = 0; j < coins.length; j++) {
                if(currentAmount == i)
                    solution[i] = numberOfCoin;

            }
        }
        return 0;
    }
}