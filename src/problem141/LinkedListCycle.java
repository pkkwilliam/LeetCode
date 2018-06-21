/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */
package problem141;

import java.util.LinkedList;

public class LinkedListCycle {
    public static void main(String[]args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(33);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next.next = head.next.next.next;



        System.out.println(new Solution().hasCycle(head));



    }
}
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && slow != null){
            if(fast.next == null)
                return false;
            else if(fast.next.next == null)
                return false;
            else
                fast = fast.next.next;
            if(slow.next != null)
                slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
