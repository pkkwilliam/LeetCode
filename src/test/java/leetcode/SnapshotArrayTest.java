package leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ka Kei Pun
 * Date: 1/13/20
 * Version: 1.0.0
 */

public class SnapshotArrayTest {

  private SnapshotArray cut;

  @Test
  public void testCase1() {
    cut = initCut(new SnapshotArray(3));
    cut.set(0, 3);
    int snapId = cut.snap();
    assertEquals(0, snapId);
    assertEquals(3, cut.get(0, 0));
  }

  @Test
  public void testCase2() {
    cut = initCut(new SnapshotArray(3));
    cut.set(0, 5);
    cut.snap();
    cut.set(0, 6);
    assertEquals(5, cut.get(0, 0));
  }

  @Test
  public void testCase3() {
    cut = initCut(new SnapshotArray(1));
    cut.set(0, 15);
    assertEquals(0, cut.snap());
    assertEquals(1, cut.snap());
    assertEquals(2, cut.snap());
    assertEquals(15, cut.get(0, 2));
    assertEquals(3, cut.snap());
    assertEquals(4, cut.snap());
    assertEquals(15, cut.get(0, 0));
  }

  @Test
  public void testCase4() {
    cut = initCut(new SnapshotArray(1));
    cut.set(0, 1);
    cut.snap();
    cut.snap();
    cut.set(0, 2);
    assertEquals(1, cut.get(0, 1));
  }

  SnapshotArray initCut(SnapshotArray cut) {
    return cut;
  }

}
