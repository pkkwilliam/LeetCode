package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

public class UniquePathsTest {

  private UniquePaths cut;

  @Before
  public void setup() {
    cut = initCut(new UniquePaths());
  }

  @Test
  public void test1() {
    assertEquals(3, cut.uniquePaths(3, 2));
  }

  @Test
  public void test2() {
    assertEquals(28, cut.uniquePaths(7, 3));
  }

  UniquePaths initCut(UniquePaths cut) {
    return cut;
  }

}
