package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 4/10/20
 * Version: 1.0.0
 */

public class LetterCombinationsofaPhoneNumberTest {

  private LetterCombinationsofaPhoneNumber cut;

  @Before
  public void setup() {
    cut = initCut(new LetterCombinationsofaPhoneNumber());
  }

  @Test
  public void test1() {
    final String[]expected = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
    final String input = "23";
    final List<String> actual = cut.letterCombinations(input);
    final String[] actualArray = actual.toArray(new String[actual.size()]);
    Assert.assertArrayEquals(expected, actualArray);
  }


  @Test
  public void test2() {
    final String[]expected = {"a", "b", "c"};
    final String input = "2";
    final List<String> actual = cut.letterCombinations(input);
    final String[] actualArray = actual.toArray(new String[actual.size()]);
    Assert.assertArrayEquals(expected, actualArray);
  }

  LetterCombinationsofaPhoneNumber initCut(LetterCombinationsofaPhoneNumber cut) {
    return cut;
  }

}
