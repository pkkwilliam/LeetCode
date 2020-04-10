package leetcode;

import common.TreeNode;

/**
 *
 * 111. Minimum Depth of Binary Tree
 *
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 Note: A leaf is a node with no children.

 Example:

 Given binary tree [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 return its minimum depth = 2.
 */


public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return recursionHelper(root);
    }

    protected int recursionHelper(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = recursionHelper(root.left);
        int right = recursionHelper(root.right);
        return 1 + (left < right ? left : right);
    }

}

