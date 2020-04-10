package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 12/31/19
 * Version: 1.0.0
 */

@RunWith(Parameterized.class)
public class SubarraySumEqualsKTest {

  private SubarraySumEqualsK subarraySumEqualsK;
  private int[] nums;
  private int k;
  private int expect;

  public SubarraySumEqualsKTest(int[] nums, int k, int expect) {
    this.nums = nums;
    this.k = k;
    this.expect = expect;
  }

  @Before
  public void setup() {
    subarraySumEqualsK = intitCut(new SubarraySumEqualsK());
  }

  @Test
  public void subarraySumTest() {
    Assert.assertEquals(this.expect, subarraySumEqualsK.subarraySum(this.nums, k));
  }

  SubarraySumEqualsK intitCut(SubarraySumEqualsK cut) {
    return cut;
  }

  @Parameterized.Parameters
  public static Collection<Object[]> generateTestData() {
    return Arrays.asList(new Object[][] {
            {new int[]{1, 1, 1}, 2 ,2},
            {new int[]{1, 2, 1, 2, 1}, 3, 4},
            {new int[]{28, 54, 7, -70, 22, 65, -6}, 100, 1},
            {new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 0, 55}
    });
  }

}
