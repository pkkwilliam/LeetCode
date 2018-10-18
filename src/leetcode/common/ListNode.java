package leetcode.common;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    private static final ListNode[] TEST_NODE_ARRAY = {
            createNodes(1,2,3,4,5,6,7),
            createNodes(1,2,3,33,4,5,6,7,8)
    };

    /**
     *
     * @param input
     * @return head of ListNode object
     */
    private static ListNode createNodes(int ... input){
        if (input == null)
            return null;
        int count = 0;
        ListNode head = new ListNode(input[count++]);
        ListNode current = head;
        while(count < input.length){
            current.next = new ListNode(count);
            current = current.next;
            count++;
        }
        return head;
    }

}
