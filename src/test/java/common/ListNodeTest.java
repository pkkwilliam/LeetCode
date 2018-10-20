package common;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListNodeTest {

    @Test
    public void createNodesTest(){
        int[] input = {9,5,2,1,2};
        ListNode currentHead = ListNode.createNodes(input);
        int count = 0;
        while (currentHead.next != null){
            assertEquals(input[count++], currentHead.val);
            currentHead = currentHead.next;
        }
        assertEquals(null, ListNode.createNodes(null));

    }

}
