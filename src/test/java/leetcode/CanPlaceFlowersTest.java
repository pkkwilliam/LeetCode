package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 2/28/20
 * Version: 1.0.0
 */

public class CanPlaceFlowersTest {

  private CanPlaceFlowers cut;

  @Before
  public void setup() {
    cut = initCut(new CanPlaceFlowers());
  }

  @Test
  public void canPlaceFlowersTest1() {
    final int[] flowerBed = {1,0,0,0,1};
    final int flowerCount = 1;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest2() {
    final int[] flowerBed = {1,0,0,0,1};
    final int flowerCount = 2;
    Assert.assertFalse(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest3() {
    final int[] flowerBed = {1,0,1};
    final int flowerCount = 2;
    Assert.assertFalse(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest4() {
    final int[] flowerBed = {1,0,0,1};
    final int flowerCount = 2;
    Assert.assertFalse(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest5() {
    final int[] flowerBed = {1,0,0,1};
    final int flowerCount = 1;
    Assert.assertFalse(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest6() {
    final int[] flowerBed = {1,0,1,0,0,0,1};
    final int flowerCount = 1;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest7() {
    final int[] flowerBed = {1,0,0,0,0,1};
    final int flowerCount = 2;
    Assert.assertFalse(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest8() {
    final int[] flowerBed = {0,0,1,0,1};
    final int flowerCount = 1;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest9() {
    final int[] flowerBed = {0,0,1,0,0};
    final int flowerCount = 2;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest10() {
    final int[] flowerBed = {0};
    final int flowerCount = 1;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  @Test
  public void canPlaceFlowersTest11() {
    final int[] flowerBed = {1,0,1,0,0};
    final int flowerCount = 1;
    Assert.assertTrue(cut.canPlaceFlowers(flowerBed, flowerCount));
  }

  CanPlaceFlowers initCut(CanPlaceFlowers cut) {
    return cut;
  }

}
