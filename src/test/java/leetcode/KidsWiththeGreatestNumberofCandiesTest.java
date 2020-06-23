package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/** Author: Ka Kei Pun Date: 6/23/20 Version: 1.0.0 */
public class KidsWiththeGreatestNumberofCandiesTest {

  private KidsWiththeGreatestNumberofCandies cut;

  @Before
  public void setup() {
    cut = initCut(new KidsWiththeGreatestNumberofCandies());
  }

  @Test
  public void test1() {
    final int[] input = {2, 3, 5, 1, 3};
    final int extraCandies = 3;
    final List<Boolean> expected = Arrays.asList(true, true, true, false, true);
    Assert.assertEquals(expected, cut.kidsWithCandies(input, extraCandies));
  }

  @Test
  public void test2() {
    final int[] input = {4, 2, 1, 1, 2};
    final int extraCandies = 1;
    final List<Boolean> expected = Arrays.asList(true, false, false, false, false);
    Assert.assertEquals(expected, cut.kidsWithCandies(input, extraCandies));
  }

  @Test
  public void test3() {
    final int[] input = {12, 1, 12};
    final int extraCandies = 10;
    final List<Boolean> expected = Arrays.asList(true, false, true);
    Assert.assertEquals(expected, cut.kidsWithCandies(input, extraCandies));
  }

  @Test
  public void test4() {
    final int[] input = {0};
    final int extraCandies = 1;
    final List<Boolean> expected = Arrays.asList(true);
    Assert.assertEquals(expected, cut.kidsWithCandies(input, extraCandies));
  }

  KidsWiththeGreatestNumberofCandies initCut(KidsWiththeGreatestNumberofCandies cut) {
    return cut;
  }
}
