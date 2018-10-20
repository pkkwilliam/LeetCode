package leetcode;

/*
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?
 */

import common.ListNode;

public class LinkedListCycle {
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
