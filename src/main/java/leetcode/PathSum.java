package leetcode;

import leetcode.common.TreeNode;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return recursion_helper(root, sum, 0);
    }
    public boolean recursion_helper(TreeNode node, int sum, int current_sum){
        if(node == null)
            return false;
        else if(node.val + current_sum == sum && node.left == null && node.right == null)
            return true;
        if(recursion_helper(node.left, sum, current_sum + node.val))
            return true;
        if(recursion_helper(node.right, sum, current_sum + node.val))
            return true;

        return false;
    }
}