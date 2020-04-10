package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 12/30/19
 * Version: 1.0.0
 */

public class LongestPalindromicSubstringTest {

  LongestPalindromicSubstring cut;
  List<String> testInput;
  List<List<String>> testResult;

  @Before
  public void setup() {
    cut = initCut(new LongestPalindromicSubstring());
  }

  @Test
  public void longestPalindromeTest() {
    if (testInput.size() == testResult.size()) {
      for (int i = 0; i < testInput.size(); i++) {
        final String actualResult = cut.longestPalindrome(testInput.get(i));
        Assert.assertTrue(testResult.get(i).contains(actualResult));
      }
    }
  }

  public LongestPalindromicSubstring initCut(LongestPalindromicSubstring cut) {
    testInput = getTestInput();
    testResult = getTestResult();
    return cut;
  }

  public List<String> getTestInput() {
    return Arrays.asList(
            "babad",
            "cbbd",
            "bbbbb",
            "b",
            "",
            "abababababababababa",
            "ababa"
    );
  }

  protected List<List<String>> getTestResult() {
    List<List<String>> result = Arrays.asList(
            createStringList("", "bab"),
            createStringList("bb"),
            createStringList("bbbbb"),
            createStringList("b"),
            createStringList(""),
            createStringList("abababababababababa"),
            createStringList("ababa")
    );
    return result;
  }

  protected List<String> createStringList(String...values) {
    return Arrays.asList(values);
  }

}
