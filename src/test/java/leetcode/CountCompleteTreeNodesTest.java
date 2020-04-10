package leetcode;

import common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 1/13/20
 * Version: 1.0.0
 */

public class CountCompleteTreeNodesTest {

  private CountCompleteTreeNodes cut;

  @Before
  public void setup() {
    cut = initCut(new CountCompleteTreeNodes());
  }

  @Test
  public void testCase1() {
    TreeNode test = TreeNode.getCompleteBinaryTree(6);
    Assert.assertEquals(6, cut.countNodes(test));
  }

  @Test
  public void testCase2() {
    TreeNode test = TreeNode.getCompleteBinaryTree(1);
    Assert.assertEquals(1, cut.countNodes(test));
  }

  @Test
  public void testCase3() {
    TreeNode test = null;
    Assert.assertEquals(0, cut.countNodes(test));
  }

  @Test
  public void testCase4() {
    for (int i = 1; i < 100; i++) {
      TreeNode test = TreeNode.getCompleteBinaryTree(i);
      Assert.assertEquals(i, cut.countNodes(test));
    }
  }

  CountCompleteTreeNodes initCut(CountCompleteTreeNodes cut) {
    return cut;
  }

}
