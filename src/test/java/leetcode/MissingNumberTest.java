package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 1/2/20
 * Version: 1.0.0
 */

public class MissingNumberTest {

  MissingNumber missingNumber;

  @Before
  public void setup() {
    missingNumber = new MissingNumber();
  }

  @Test
  public void missingNumberTest() {
    List<int[]> test = getTestInput();
    int[] expected = getExpected();
    if (test.size() == expected.length) {
      for (int i = 0; i < test.size(); i++) {
        Assert.assertEquals(expected[i], missingNumber.missingNumber(test.get(i)));
      }
    }
  }

  List<int[]> getTestInput() {
    return Arrays.asList(
            new int[] {0, 1, 2 ,3, 4, 6},
            new int[] {3,0,1},
            new int[] {9,6,4,2,3,5,7,0,1},
            new int[] {0},
            new int[] {1},
            new int[] {1, 2}
    );
  }

  int[] getExpected() {
    return new int[] {5, 2,  8, 1, 0, 0};
  }

}
