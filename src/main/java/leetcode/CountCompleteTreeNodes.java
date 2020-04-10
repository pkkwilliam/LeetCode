package leetcode;

import common.TreeNode;

/**
 * Author: Ka Kei Pun
 * Date: 1/13/20
 * Version: 1.0.0
 */

public class CountCompleteTreeNodes {
  public int countNodes(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}
