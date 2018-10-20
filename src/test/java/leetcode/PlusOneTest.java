package leetcode;

import common.CommonFunction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PlusOneTest {

    private static final CommonFunction COMMON_FUNCTION = new CommonFunction();
    private PlusOne plusOne;
    private int[] input;
    private int[] expected;

    @Before
    public void initialize(){
        plusOne = new PlusOne();
    }

    public PlusOneTest(int[] input, int[] expected){
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testPlusOneChecker(){
        int[] result = plusOne.plusOne(input);
        assertArrayEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData(){
        return Arrays.asList(
                new Object[][] {
                        {COMMON_FUNCTION.createArray(1,2,3), COMMON_FUNCTION.createArray(1,2,4)},
                        {COMMON_FUNCTION.createArray(4,3,2,1), COMMON_FUNCTION.createArray(4,3,2,2)},
                        {COMMON_FUNCTION.createArray(9), COMMON_FUNCTION.createArray(1,0)},
                        {COMMON_FUNCTION.createArray(1,2,9), COMMON_FUNCTION.createArray(1,3,0)},
                        {COMMON_FUNCTION.createArray(9,9,9,9), COMMON_FUNCTION.createArray(1,0,0,0,0)},
                        {COMMON_FUNCTION.createArray(8,9,9,9), COMMON_FUNCTION.createArray(9,0,0,0)},
                }
        );
    }
}
