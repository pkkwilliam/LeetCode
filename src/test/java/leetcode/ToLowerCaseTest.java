package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ka Kei Pun
 * Date: 3/23/19
 * Version: 1.0.0
 */

public class ToLowerCaseTest {

    private ToLowerCase cut;
    private static String[] TESTS = {
            "HELLO"
    };
    private static String[] EXPECTS = {
            "hello"
    };

    @Before
    public void setup() {
        cut = initCut(new ToLowerCase());
    }

    @Test
    public void toLowerCase() {
        for (int i = 0; i < TESTS.length; i++) {
            assertEquals(EXPECTS[i], cut.toLowerCase(TESTS[i]));
        }
    }

    ToLowerCase initCut(ToLowerCase cut) {
        return cut;
    }

}
