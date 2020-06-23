package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Author: Ka Kei Pun Date: 6/23/20 Version: 1.0.0 */

public class ReverseVowelsofaStringTest {

  private ReverseVowelsofaString cut;

  @Before
  public void setup() {
    cut = initCut(new ReverseVowelsofaString());
  }

  @Test
  public void test1() {
    Assert.assertEquals("holle", cut.reverseVowels("hello"));
  }

  @Test
  public void test2() {
    Assert.assertEquals("leotcede", cut.reverseVowels("leetcode"));
  }

  @Test
  public void test3() {
    Assert.assertEquals("hi", cut.reverseVowels("hi"));
  }

  @Test
  public void test4() {
    Assert.assertEquals("hh", cut.reverseVowels("hh"));
  }

  @Test
  public void test5() {
    Assert.assertEquals("aeiou", cut.reverseVowels("uoiea"));
  }

  @Test
  public void test6() {
    Assert.assertEquals("i", cut.reverseVowels("i"));
  }

  @Test
  public void test7() {
    Assert.assertEquals("nin", cut.reverseVowels("nin"));
  }

  @Test
  public void test8() {
    Assert.assertEquals("", cut.reverseVowels(""));
  }

  @Test
  public void test9() {
    Assert.assertEquals("aA", cut.reverseVowels("Aa"));
  }

  @Test
  public void test10() {
    Assert.assertEquals("a.b,.", cut.reverseVowels("a.b,."));
  }

  ReverseVowelsofaString initCut(ReverseVowelsofaString cut) {
    return cut;
  }
}
