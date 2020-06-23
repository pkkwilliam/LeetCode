package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class RunningSumof1dArrayTest {

  private RunningSumof1dArray cut;

  @Before
  public void RunningSumof1dArrayTest() {
    cut = initCut(new RunningSumof1dArray());
  }

  @Test
  public void test1() {
    final int[] result = cut.runningSum(new int[] {1, 2, 3, 4});
    final int[] expected = {1, 3, 6, 10};
    Assert.assertArrayEquals(result, expected);
  }

  @Test
  public void test2() {
    final int[] result = cut.runningSum(new int[] {1, 1, 1, 1, 1});
    final int[] expected = {1, 2, 3, 4, 5};
    Assert.assertArrayEquals(result, expected);
  }

  @Test
  public void test3() {
    final int[] result = cut.runningSum(new int[] {3, 1, 2, 10, 1});
    final int[] expected = {3, 4, 6, 16, 17};
    Assert.assertArrayEquals(result, expected);
  }

    @Test
    public void test4() {
        final int[] result = cut.runningSum(new int[] {99});
        final int[] expected = {99};
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void test5() {
        final int[] result = cut.runningSum(new int[] {});
        final int[] expected = {};
        Assert.assertArrayEquals(result, expected);
    }

  RunningSumof1dArray initCut(RunningSumof1dArray cut) {
    return cut;
  }
}
