package leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

/**
 *  Author: Ka Kei Pun'
 *  Date: 02/02/2019
 *  Version: 1.0.0
 */


@RunWith(Parameterized.class)
public class TwoSumTest {

    private static TwoSum cut;
    private int[] input;
    private int target;
    private int[] actual;

    public TwoSumTest(int[] input, int target, int[] actual) {
        this.input = input;
        this.target = target;
        this.actual = actual;
    }

    @Test
    public void twoSumHashMapTest() {
        assertArrayEquals(cut.twoSum(this.input, this.target), this.actual);
    }

    @Test
    public void twoSumTest() {
        assertArrayEquals(cut.twoSum(this.input, this.target), this.actual);
    }

    @Before
    public void initialize() {
        cut = new TwoSum();

    }

    @Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}}
        });
    }


}
