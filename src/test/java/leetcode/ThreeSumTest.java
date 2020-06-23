package leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

public class ThreeSumTest {

  private ThreeSum cut;

  @Before
  public void setup() {
    cut = initCut(new ThreeSum());
  }

  @Test
  public void test1() {
    final int[] input = {-1, 0, 1, 2, -1, -4};
    final int[][] expected = {
            {-1, 0, 1},
            {-1, -1, 2}
    };
    final List<List<Integer>> actual = cut.threeSum(input);
    System.out.println(actual);
  }

  @Test
  public void test2() {
    final int[] input = {-3, -2, -1, 0, -1, 1, 2 ,4};
    final int[][] expected = {

    };
    final List<List<Integer>> actual = cut.threeSum(input);
    System.out.println(actual);
  }

  @Test
  public void test3() {
    final int[] input = {0,0,0,0};
    final int[][] expected = {

    };
    final List<List<Integer>> actual = cut.threeSum(input);
    System.out.println(actual);
  }

  ThreeSum initCut(ThreeSum cut) {
    return cut;
  }

}
