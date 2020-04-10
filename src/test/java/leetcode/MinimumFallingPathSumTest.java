package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 1/17/20
 * Version: 1.0.0
 */

public class MinimumFallingPathSumTest {

  private MinimumFallingPathSum cut;

  @Before
  public void setup() {
    cut = initCut(new MinimumFallingPathSum());
  }

  @Test
  public void testCase1() {
    int[][] testCase = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };
    Assert.assertEquals(12, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase2() {
    int[][] testCase = {
            {1,2,3,9,2},
            {1,2,3,9,2},
            {1,2,3,9,2}
    };
    Assert.assertEquals(3, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase3() {
    int[][] testCase = {
            {111,2,109,9,2},
            {99,2,3,9,1},
            {1,2,1000,9,2}
    };
    Assert.assertEquals(5, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase4() {
    int[][] testCase = {
            {69}
    };
    Assert.assertEquals(69, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase5() {
    int[][] testCase = {
            {69, 99, 12, 33}
    };
    Assert.assertEquals(12, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase6() {
    int[][] testCase = {
            {17, 82},
            {1, -44}
    };
    Assert.assertEquals(-27, cut.minFallingPathSum(testCase));
  }

  @Test
  public void testCase7() {
    int[][] testCase = {
            {51, 24},
            {-50, 82}
    };
    Assert.assertEquals(-26, cut.minFallingPathSum(testCase));
  }

  MinimumFallingPathSum initCut(MinimumFallingPathSum cut) {
    return cut;
  }

}
