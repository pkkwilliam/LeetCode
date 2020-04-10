package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 3/2/20
 * Version: 1.0.0
 */

public class ZeroOneMatrixTest {

  private ZeroOneMatrix cut;

  @Before
  public void setup() {
    cut = initCut(new ZeroOneMatrix());
  }

  @Test
  public void updateMatrixTest1() {
    final int[][] input = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
    };
    final int[][] expected = {
            {0,0,0},
            {0,1,0},
            {0,0,0}
    };
    Assert.assertArrayEquals(expected, cut.updateMatrix(input));
  }

  @Test
  public void updateMatrixTest2() {
    final int[][] input = {
            {0,0,0},
            {0,1,0},
            {1,1,1}
    };
    final int[][] expected = {
            {0,0,0},
            {0,1,0},
            {1,2,1}
    };
    Assert.assertArrayEquals(expected, cut.updateMatrix(input));
  }

  @Test
  public void updateMatrixTest3() {
    final int[][] input = {
            {0,0,0},
            {0,1,0},
            {1,1,1},
            {1,1,1},
    };
    final int[][] expected = {
            {0,0,0},
            {0,1,0},
            {1,2,1},
            {2,3,2}
    };
    Assert.assertArrayEquals(expected, cut.updateMatrix(input));
  }

  ZeroOneMatrix initCut(ZeroOneMatrix cut) {
    return cut;
  }

}
