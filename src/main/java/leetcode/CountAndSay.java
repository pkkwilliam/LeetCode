package leetcode;

/**
 * Author: Ka Kei Pun
 * Date: 11/12/19
 * Version: 1.0.0
 */

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 *
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 */

public class CountAndSay {

    public String countAndSay(int n) {
        return recursionHelper(n, 0, 0, "1", "1");
    }

    protected String recursionHelper(int n, int currentIndex, int currentCount, String previousResult, String currentResult) {
        if (n - 1 == currentIndex ) {
            return currentResult;
        }
        if (previousResult.charAt(currentIndex + 1) == previousResult.charAt(currentIndex)) {
            return recursionHelper(n, currentIndex + 1, currentCount + 1, previousResult, currentResult);
        } else {
            final String localResult = "" + currentCount + previousResult.charAt(currentIndex);
            return recursionHelper(n, currentIndex + 1, 0, previousResult, currentResult + localResult);
        }
    }

}