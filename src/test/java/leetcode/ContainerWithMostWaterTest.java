package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 4/16/20
 * Version: 1.0.0
 */

public class ContainerWithMostWaterTest {

  private ContainerWithMostWater cut;

  @Before
  public void setup() {
   cut = initCut(new ContainerWithMostWater());
  }

  @Test
  public void test1() {
    final int[] input = {1,8,6,2,5,4,8,3,7};
    Assert.assertEquals(49, cut.maxArea(input));
  }

  @Test
  public void test2() {
    final int[] input = {1,1,1,1,1,1};
    Assert.assertEquals(5, cut.maxArea(input));
  }

  @Test
  public void test3() {
    final int[] input = {9,5};
    Assert.assertEquals(5, cut.maxArea(input));
  }

  ContainerWithMostWater initCut(ContainerWithMostWater cut) {
    return cut;
  }

}
