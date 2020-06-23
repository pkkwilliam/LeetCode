package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 4/14/20
 * Version: 1.0.0
 */

public class SubarrayProductLessThanKTest {

  private SubarrayProductLessThanK cut;

  @Before
  public void setup() {
    cut = initCut(new SubarrayProductLessThanK());
  }

  @Test
  public void test1() {
    Assert.assertEquals(8, cut.numSubarrayProductLessThanK(new int[] {10, 5, 2, 6}, 100));
  }

  @Test
  public void test2() {
    Assert.assertEquals(1, cut.numSubarrayProductLessThanK(new int[] {0}, 100));
  }

  @Test
  public void test3() {
    Assert.assertEquals(3, cut.numSubarrayProductLessThanK(new int[] {1, 1}, 100));
  }

  @Test
  public void test4() {
    Assert.assertEquals(0, cut.numSubarrayProductLessThanK(new int[] {1, 1, 1}, 1));
  }

  SubarrayProductLessThanK initCut(SubarrayProductLessThanK cut) {
    return cut;
  }

}
