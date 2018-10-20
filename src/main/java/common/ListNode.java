package common;

/**
 * Author: Ka Kei Pun
 * Last Update: 10/17/2018
 * Version: 1.0.0
 */

public class ListNode {
    public String s;
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    /**
     *
     * @param input
     * @return head of ListNode object
     */
    static ListNode createNodes(int ... input){
        if (input == null) {
            return null;
        }
        int count = 0;
        ListNode head = new ListNode(input[count++]);
        ListNode current = head;
        while(count < input.length){
            current.next = new ListNode(input[count]);
            current = current.next;
            count++;
        }
        return head;
    }

}
