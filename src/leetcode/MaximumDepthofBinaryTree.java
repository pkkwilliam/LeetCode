/**
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

 Note: A leaf is a node with no children.

 Example:

 Given binary tree [3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 return its depth = 3.
 */
package leetcode;

import leetcode.common.TreeNode;

public class MaximumDepthofBinaryTree {
    public static void main(String[]args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.left.left = new TreeNode(9);

        System.out.println(new Solution104().maxDepth(root));
    }
}

class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? 1 + left : 1 + right;
    }
}
