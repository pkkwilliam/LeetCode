/**
 * Given a binary tree, return all root-to-leaf paths.

 Note: A leaf is a node with no children.

 Example:

 Input:

 1
 /   \
 2     3
 \
 5

 Output: ["1->2->5", "1->3"]

 Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

package problem257;

import java.util.*;

public class BinaryTreePaths {
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);


    }
}
class Solution {
    public List<String> binaryTreePaths(TreeNode root, List<String> list, String current) {
        if(root.left == null && root.right == null)
            return list;
        current += root.val + "->";
        if(root.left != null){

        }
        if(root.right != null){

        }
    return null;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        this.val = x;
    }
}
