package leetcode;

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

import leetcode.common.TreeNode;
import java.util.*;

public class BinaryTreePaths {
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