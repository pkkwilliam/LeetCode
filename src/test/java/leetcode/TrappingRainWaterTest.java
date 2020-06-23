package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 4/16/20
 * Version: 1.0.0
 */

public class TrappingRainWaterTest {

  private TrappingRainWater cut;

  @Before
  public void setup() {
    cut = initCut(new TrappingRainWater());
  }

  @Test
  public void test1() {
    final int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
    Assert.assertEquals(6, cut.trap(input));
  }

  @Test
  public void test2() {
    final int[] input = {3, 1, 0, 1, 2, 4};
    Assert.assertEquals(8, cut.trap(input));
  }

  TrappingRainWater initCut(TrappingRainWater cut) {
    return cut;
  }

}
