/**
 *
 * Ka Kei Pun
 *
 * 08/13/2018
 *
 * 204. Count Primes
 * Count the number of prime numbers less than a non-negative number, n.

 Example:

 Input: 10
 Output: 4
 Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

package leetcode;

public class CountPrimes {
    public static void main(String[]args){
        int[] input = {10, 15, 99,100,0,1,2,3,4,499979};
        for(int i : input)
            System.out.println("input = "+i+" : "+new Solution204().countPrimes(i));
    }
}
class Solution204 {
        public int countPrimes(int n) {
            if(n < 3)
                return 0;
            int count = 1;
            if(n % 2 == 0)
                return 0;
            loop:
            for(int i = 3; i < n; i++){
                if(i% 2 == 0)
                    break;
                for(int j = i - 1; j > 2; j--)
                    if(i % j == 0)
                        continue loop;
                count++;
            }
            return count;
        }
}