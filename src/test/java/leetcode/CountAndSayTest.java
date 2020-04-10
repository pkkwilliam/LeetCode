package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Date: 11/21/19
 * Version: 1.0.0
 */

public class CountAndSayTest {

    private CountAndSay cut;

    @Before
    public void setup() {
        cut = initCut(new CountAndSay());
    }

    @Test
    public void countAnySay() {
        getTestCases().forEach(testCase -> {
            Assert.assertEquals(testCase.expected, cut.countAndSay(testCase.input));
        });
    }

    List<CountAndSayTestModal> getTestCases() {
        return Arrays.asList(
                new CountAndSayTestModal(1, "1"),
                new CountAndSayTestModal(4, "1211")
        );
    }


    CountAndSay initCut(CountAndSay cut) {
        return cut;
    }

}

class CountAndSayTestModal {

    int input;
    String expected;

    public CountAndSayTestModal(int input, String expected) {
        this.input = input;
        this.expected = expected;
    }
}