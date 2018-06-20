package problem414;

/*
Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
Example 2:
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */

public class ThirdMaximumNumber {
    public static void main(String[]args){
        int[][] input = {
                {3,2,1}, // 1
                {1,2}, // 2
                {2,2,3,1}, // 1
                {1,2,2}, // 2
                {1,2,-2147483648}, // -214...
                {1,2,2,5,3,5}, // 2
                {1,-2147483648,2} // -214...
        };
        for(int[] i : input)
            System.out.println("Result "+new Solution().thirdMax(i));
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;
        for (Integer i : nums) {
            if (i.equals(first) || i.equals(second) || i.equals(third))
                continue;
            if (first == null || i > first) {
                third = second;
                second = first;
                first = i;
            } else if (second == null || i > second) {
                third = second;
                second = i;
            } else if (third == null || i > third)
                third = i;
        }
        return (third != null) ? third : first;
    }
}