/**
 * 165. Compare Version Numbers
 *
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
 *
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
 *
 * Example 1:
 *
 * Input: version1 = "0.1", version2 = "1.1"
 * Output: -1
 * Example 2:
 *
 * Input: version1 = "1.0.1", version2 = "1"
 * Output: 1
 * Example 3:
 *
 * Input: version1 = "7.5.2.4", version2 = "7.5.3"
 * Output: -1
 *
 */

package leetcode;

import java.util.*;


public class CompareVersionNumbers {
    public static void main(String[]args){
        String[] version1 = {"0.1","1.0.1","7.5.2.4","1.0"};
        String[] version2 = {"1.1","1","7.5.3","1"};
        for(int i = 0; i < version1.length; i++)
            System.out.println(new Solution165().compareVersion(version1[i],version2[i]));
    }
}
class Solution165 {
    public int compareVersion(String version1, String version2) {
        // TODO Last Test Case: "1.0", "1"
        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
        int length = v1.length < v2.length ? v1.length : v2.length;
        for(int i = 0; i < length; i++){
            int v1Num = Integer.valueOf(v1[i]), v2Num = Integer.valueOf(v2[i]);
            if(v1Num > v2Num)
                return 1;
            else if(v2Num > v1Num)
                return -1;
        }
        return v1.length == v2.length ? 0 : v1.length > v2.length ? 1 : -1;
    }
}