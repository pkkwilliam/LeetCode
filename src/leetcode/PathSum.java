package leetcode;

import leetcode.common.TreeNode;

public class PathSum {
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        // root.right = new TreeNode(9);

        // root.left.right = new TreeNode(10);
        // root.left.left = new TreeNode(11);
        System.out.println(new Solution112().hasPathSum(root,1));
    }
}
class Solution112 {
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