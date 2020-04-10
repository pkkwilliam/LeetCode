package leetcode;

/**

Name: Ka Kei Pun
Date: 08/05/2018

662. Maximum Width of Binary Tree

Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.

Example 1:
Input:

           1
         /   \
        3     2
       / \     \
      5   3     9

Output: 4
Explanation: The maximum width existing in the third level with the length 4 (5,3,null,9).
Example 2:
Input:

          1
         /
        3
       / \
      5   3

Output: 2
Explanation: The maximum width existing in the third level with the length 2 (5,3).
Example 3:
Input:

          1
         / \
        3   2
       /
      5

Output: 2
Explanation: The maximum width existing in the second level with the length 2 (3,2).
Example 4:
Input:

          1
         / \
        3   2
       /     \
      5       9
     /         \
    6           7
Output: 8
Explanation:The maximum width existing in the fourth level with the length 8 (6,null,null,null,null,null,null,7).


Note: Answer will in the range of 32-bit signed integer.
 */


import common.TreeNode;

import java.util.*;

public class MaximumWidthofBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        int result = 0;

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int level = 0, count;
        double levelNode;
        TreeNode current;
        boolean rowEmpty = false;

        while(!rowEmpty){
            levelNode = Math.pow(2,level++);
            count = 0;
            rowEmpty = true;
            while(count++ < levelNode){
                current = nodes.poll();
                System.out.print(current != null ? current.val+" " : "x ");
                if(current != null) {
                    nodes.add(current.left == null ? null : current.left);
                    nodes.add(current.right == null ? null : current.right);
                }
            }
            System.out.println();
        }
        return result;
    }
}