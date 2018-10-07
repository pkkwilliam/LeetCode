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

package leetcode;

import leetcode.common.TreeNode;

public class MinimumDepthofBinaryTree {
    public static void main(String[]args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);

        System.out.println(new Solution111().minDepth(root));
    }
}
class Solution111 {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left < right ? left + 1 : right + 1;
    }
}

