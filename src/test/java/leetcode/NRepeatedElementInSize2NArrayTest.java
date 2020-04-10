package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Ka Kei Pun
 * Date: 3/23/19
 * Version: 1.0.0
 */

public class NRepeatedElementInSize2NArrayTest {

    private NRepeatedElementInSize2NArray cut;
    private int[][] TESTS = {
            {1,2,3,3},
            {2,1,2,5,3,2},
            {5,1,5,2,5,3,5,4}
    };

    private int[] EXPECTS = {
            3, 2, 5
    };

    @Before
    public void setup() {
        cut = initCut(new NRepeatedElementInSize2NArray());
    }

    @Test
    public void repeatedNTimes() {
        for (int i = 0; i < TESTS.length; i++) {
            assertEquals(EXPECTS[i], cut.repeatedNTimes(TESTS[i]));
        }
    }

    NRepeatedElementInSize2NArray initCut(NRepeatedElementInSize2NArray cut) {
        return cut;
    }

}
