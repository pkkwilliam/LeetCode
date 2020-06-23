package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 4/14/20
 * Version: 1.0.0
 */

public class MinCostClimbingStairsTest {

  private MinCostClimbingStairs cut;

  @Before
  public void setup() {
    cut = initCut(new MinCostClimbingStairs());
  }

  @Test
  public void test1() {
    final int[] input = {10, 15, 20};
    Assert.assertEquals(15, cut.minCostClimbingStairs(input));
  }

  @Test
  public void test2() {
    final int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    Assert.assertEquals(6, cut.minCostClimbingStairs(input));
  }

  @Test
  public void test3() {
    final int[] input = {1};
    Assert.assertEquals(1, cut.minCostClimbingStairs(input));
  }

  @Test
  public void test4() {
    final int[] input = {1, 1};
    Assert.assertEquals(1, cut.minCostClimbingStairs(input));
  }

  @Test
  public void test5() {
    final int[] input = {2, 1};
    Assert.assertEquals(1, cut.minCostClimbingStairs(input));
  }

  @Test
  public void test6() {
    final int[] input = {1, 100, 1};
    Assert.assertEquals(2, cut.minCostClimbingStairs(input));
  }

  MinCostClimbingStairs initCut(MinCostClimbingStairs cut) {
    return cut;
  }

}
