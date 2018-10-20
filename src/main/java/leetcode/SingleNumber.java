package leetcode;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Example 1:

 Input: [2,2,1]
 Output: 1
 Example 2:

 Input: [4,1,2,1,2]
 Output: 4
 */

import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            if(map.containsKey(current))
                map.remove(current);
            else
                map.put(current,1);
        }
        return map.keySet().iterator().next();
    }
}