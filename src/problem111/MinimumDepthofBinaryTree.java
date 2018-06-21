package problem111;

public class MinimumDepthofBinaryTree {
    public static void main(String[]args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);

        System.out.println(new Solution().minDepth(root));
    }
}
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left < right ? left + 1 : right + 1;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
