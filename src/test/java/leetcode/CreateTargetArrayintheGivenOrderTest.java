package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class CreateTargetArrayintheGivenOrderTest {

  private CreateTargetArrayintheGivenOrder cut;

  @Before
  public void setup() {
    cut = initCut(new CreateTargetArrayintheGivenOrder());
  }

  @Test
  public void test1() {
    final int[] input = {0, 1, 2, 3, 4};
    final int[] index = {0, 1, 2, 2, 1};
    final int[] expected = {0, 4, 1, 3, 2};
    Assert.assertArrayEquals(expected, cut.createTargetArray(input, index));
  }

  @Test
  public void test2() {
    final int[] input = {1, 2, 3, 4, 0};
    final int[] index = {0, 1, 2, 3, 0};
    final int[] expected = {0, 1, 2, 3, 4};
    Assert.assertArrayEquals(expected, cut.createTargetArray(input, index));
  }

  @Test
  public void test3() {
    final int[] input = {1};
    final int[] index = {0};
    final int[] expected = {1};
    Assert.assertArrayEquals(expected, cut.createTargetArray(input, index));
  }

    @Test
    public void test4() {
        final int[] input = {};
        final int[] index = {};
        final int[] expected = {};
        Assert.assertArrayEquals(expected, cut.createTargetArray(input, index));
    }

  CreateTargetArrayintheGivenOrder initCut(CreateTargetArrayintheGivenOrder cut) {
    return cut;
  }
}
