package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 1/20/20
 * Version: 1.0.0
 */

public class CherryPickupTest {

  private CherryPickup cut;

  @Before
  public void setup() {
    cut = initCut(new CherryPickup());
  }

  @Test
  public void testCase1() {
    int[][] input = {
            {0,1,-1},
            {1,0,-1},
            {1,1,1},
    };
    Assert.assertEquals(5, cut.cherryPickup(input));
  }

  @Test
  public void testCase2() {
    int[][] input = {
            {0,1,-1},
            {0,0,-1},
            {0,0,0},
    };
    Assert.assertEquals(1, cut.cherryPickup(input));
  }

  @Test
  public void testCase3() {
    int[][] input = {
            {0,1,-1}
    };
    Assert.assertEquals(0, cut.cherryPickup(input));
  }

  @Test
  public void testCase4() {
    int[][] input = {
            {0}
    };
    Assert.assertEquals(0, cut.cherryPickup(input));
  }

  @Test
  public void testCase5() {
    int[][] input = {
            {0,-1,-1},
            {-1,0,-1},
            {1,1,1},
    };
    Assert.assertEquals(0, cut.cherryPickup(input));
  }

  @Test
  public void testCase6() {
    int[][] input = {
            {0,-1,-1,-1,-1},
            {-1,0,-1,-1,-1},
            {1,1,1,-1,-1},
            {-1,0,-1,-1,-1},
            {1,1,1,-1,-1}
    };
    Assert.assertEquals(0, cut.cherryPickup(input));
  }

  CherryPickup initCut(CherryPickup cut) {
    return cut;
  }

}
