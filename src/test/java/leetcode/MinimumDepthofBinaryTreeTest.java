package leetcode;

import common.TreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 1/18/20
 * Version: 1.0.0
 */

public class MinimumDepthofBinaryTreeTest {

  private MinimumDepthofBinaryTree cut;

  @Before
  public void setup() {
    cut = initCut(new MinimumDepthofBinaryTree());
  }

  @Test
  public void testCase1() {
    Integer[] input = {3,9,20,null,null,15,7};
    TreeNode inputTreeNode = TreeNode.constructTreeFromInteger(input);
    Assert.assertEquals(2, cut.minDepth(inputTreeNode));
  }

  @Test
  public void testCase2() {
    Integer[] input = {1,2};
    TreeNode inputTreeNode = TreeNode.constructTreeFromInteger(input);
    Assert.assertEquals(2, cut.minDepth(inputTreeNode));
  }

  @Test
  public void testCase3() {
    Integer[] input = {1};
    TreeNode inputTreeNode = TreeNode.constructTreeFromInteger(input);
    Assert.assertEquals(1, cut.minDepth(inputTreeNode));
  }

  @Test
  public void testCase4() {
    Integer[] input = {1,2,null,3,null,4, null, 5, 6};
    TreeNode inputTreeNode = TreeNode.constructTreeFromInteger(input);
    Assert.assertEquals(5, cut.minDepth(inputTreeNode));
  }

  @Test
  public void testCase5() {
    Integer[] input = {};
    TreeNode inputTreeNode = TreeNode.constructTreeFromInteger(input);
    Assert.assertEquals(0, cut.minDepth(inputTreeNode));
  }

  MinimumDepthofBinaryTree initCut(MinimumDepthofBinaryTree cut) {
    return cut;
  }

}
