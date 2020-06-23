package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Author: Ka Kei Pun Date: 6/19/20 Version: 1.0.0 */
public class FindPeakElementTest {

  private FindPeakElement cut;

  @Before
  public void setup() {
    cut = initCut(new FindPeakElement());
  }

  @Test
  public void test1() {
    Assert.assertEquals(2, cut.findPeakElement(new int[] {1, 2, 3, 1}));
  }

  @Test
  public void test2() {
    Assert.assertEquals(1, cut.findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4}));
  }

    @Test
    public void test3() {
        Assert.assertEquals(7, cut.findPeakElement(new int[] {1,2,3,4,5,6,7,8}));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, cut.findPeakElement(new int[] {0}));
    }

    @Test
    public void test5() {
        Assert.assertEquals(2, cut.findPeakElement(new int[] {-1, 0, 1}));
    }


    FindPeakElement initCut(FindPeakElement cut) {
    return cut;
  }
}
