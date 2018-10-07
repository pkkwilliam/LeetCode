/**
 *
 * 230. Kth Smallest Element in a BST
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
 *
 * Example 1:
 *
 * Input: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * Output: 1
 * Example 2:
 *
 * Input: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * Output: 3
 * Follow up:
 * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 */

package leetcode;

import leetcode.common.TreeNode;
import java.util.*;

public class KthSmallestElementinaBST {
    public static void main(String[]args){

        TreeNode root = TreeNode.getTree1();
        System.out.println(new Solution230().kthSmallest(root,3));

    }
}
class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        int kThSmallestValue = Integer.MAX_VALUE;
        int currentCount = 0;




        return currentCount > 0 ? kThSmallestValue : 0;
    }
}