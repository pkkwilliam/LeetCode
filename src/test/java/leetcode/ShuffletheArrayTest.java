package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class ShuffletheArrayTest {

  private ShuffletheArray cut;

  @Before
  public void setup() {
    cut = initCut(new ShuffletheArray());
  }

  @Test
  public void test1() {
    final int[] input = {2, 5, 1, 3, 4, 7};
    final int n = 3;
    final int[] expected = {2, 3, 5, 4, 1, 7};
    Assert.assertArrayEquals(expected, cut.shuffle(input, n));
  }

  @Test
  public void test2() {
    final int[] input = {1, 2, 3, 4, 4, 3, 2, 1};
    final int n = 4;
    final int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
    Assert.assertArrayEquals(expected, cut.shuffle(input, n));
  }

  @Test
  public void test3() {
    final int[] input = {1, 1, 2, 2};
    final int n = 2;
    final int[] expected = {1, 2, 1, 2};
    Assert.assertArrayEquals(expected, cut.shuffle(input, n));
  }

  ShuffletheArray initCut(ShuffletheArray cut) {
    return cut;
  }
}
