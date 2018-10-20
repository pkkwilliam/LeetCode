package leetcode;

/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */

import common.ListNode;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result = head, current = head.next;
        while(current != null){
            if(head.val == current.val)
                current = current.next;
            else{
                head.next = current;
                head = head.next;
                current = current.next;
            }
        }
        return result;
    }
}