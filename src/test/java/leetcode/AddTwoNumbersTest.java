package leetcode;

import common.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Author: Ka Kei Pun
 * Date: 10/20/2018
 * Version: 1.0.0
 */

@RunWith(Parameterized.class)
public class AddTwoNumbersTest {

    private static int COUNT = 0;
    private AddTwoNumbers addTwoNumbers;
    private ListNode l1;
    private ListNode l2;
    private ListNode expected;

    @Before
    public void initialize() {
        addTwoNumbers = new AddTwoNumbers();
    }

    public AddTwoNumbersTest(ListNode l1, ListNode l2, ListNode expected) {
        this.l1 = l1;
        this.l2 = l2;
        this.expected = expected;
    }

    @Test
    public void testaddTwoNumbersChecker() {
        System.out.println("\nTest: " + COUNT++);
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        while (expected != null || actual != null) {
            System.out.println(expected.val + " " + actual.val);
            Assert.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(
                new Object[][]{
                        {
                                ListNode.createNodes(7, 2, 4, 3),
                                ListNode.createNodes(5, 6, 4),
                                ListNode.createNodes(7, 8, 0, 7)
                        }, {
                        ListNode.createNodes(1, 2, 3, 4),
                        ListNode.createNodes(1, 2, 3, 4),
                        ListNode.createNodes(2, 4, 6, 8)
                }, {
                        ListNode.createNodes(1, 2),
                        ListNode.createNodes(8),
                        ListNode.createNodes(2, 0)
                }
                }
        );
    }

}
