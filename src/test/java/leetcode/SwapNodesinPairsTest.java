package leetcode;

import common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 1/17/20
 * Version: 1.0.0
 */

public class SwapNodesinPairsTest {

  private SwapNodesinPairs cut;

  @Before
  public void setup() {
    cut = initCut(new SwapNodesinPairs());
  }

  @Test
  public void testCase1() {
    int[] input = {1,2,3,4};
    int[] expected = {2,1,4,3};
    ListNode inputListNode = ListNode.createNodes(input);
    ListNode actualResult = cut.swapPairs(inputListNode);
    int[] actualResultArray = ListNode.convertNodeToArray(actualResult);
    Assert.assertArrayEquals(expected, actualResultArray);;
  }

  @Test
  public void testCase2() {
    int[] input = {1,2,3,4,5,6};
    int[] expected = {2,1,4,3,6,5};
    ListNode inputListNode = ListNode.createNodes(input);
    ListNode actualResult = cut.swapPairs(inputListNode);
    int[] actualResultArray = ListNode.convertNodeToArray(actualResult);
    Assert.assertArrayEquals(expected, actualResultArray);;
  }

  @Test
  public void testCase3() {
    int[] input = {1};
    int[] expected = {1};
    ListNode inputListNode = ListNode.createNodes(input);
    ListNode actualResult = cut.swapPairs(inputListNode);
    int[] actualResultArray = ListNode.convertNodeToArray(actualResult);
    Assert.assertArrayEquals(expected, actualResultArray);;
  }

  @Test
  public void testCase4() {
    int[] input = {1,2,3};
    int[] expected = {2,1,3};
    ListNode inputListNode = ListNode.createNodes(input);
    ListNode actualResult = cut.swapPairs(inputListNode);
    int[] actualResultArray = ListNode.convertNodeToArray(actualResult);
    Assert.assertArrayEquals(expected, actualResultArray);;
  }

  SwapNodesinPairs initCut(SwapNodesinPairs cut) {
    return cut;
  }

}
