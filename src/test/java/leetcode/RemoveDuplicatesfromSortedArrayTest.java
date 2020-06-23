package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

public class RemoveDuplicatesfromSortedArrayTest {

  private RemoveDuplicatesfromSortedArray cut;

  @Before
  public void setup() {
    cut = initCut(new RemoveDuplicatesfromSortedArray());
  }

  @Test
  public void test1() {
    final int[] input = {1,1,2};
    final int expected = 2;
    Assert.assertEquals(expected, cut.removeDuplicates(input));
    printNumArray(input);
  }

  @Test
  public void test2() {
    final int[] input = {0,0,1,1,1,2,2,3,3,4};
    final int expected = 5;
    Assert.assertEquals(expected, cut.removeDuplicates(input));
    printNumArray(input);
  }

  @Test
  public void test3() {
    final int[] input = {0};
    final int expected = 1;
    Assert.assertEquals(expected, cut.removeDuplicates(input));
    printNumArray(input);
  }

  @Test
  public void test4() {
    final int[] input = {0,0,0,0,0,0,0,0,0,0};
    final int expected = 1;
    Assert.assertEquals(expected, cut.removeDuplicates(input));
    printNumArray(input);
  }

  @Test
  public void test5() {
    final int[] input = {1,2,3,4,5,6,7,8,9};
    final int expected = 9;
    Assert.assertEquals(expected, cut.removeDuplicates(input));
    printNumArray(input);
  }

  private void printNumArray(int[] array) {
    System.out.println();
    for (int i: array) {
      System.out.print(i + "");
    }
  }

  RemoveDuplicatesfromSortedArray initCut(RemoveDuplicatesfromSortedArray cut) {
    return cut;
  }

}
