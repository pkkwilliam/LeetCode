package leetcode;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

import common.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        while(l1 != null || l2 != null){
            int n1 = (l1 != null) ? l1.val : Integer.MAX_VALUE;
            int n2 = (l2 != null) ? l2.val : Integer.MAX_VALUE;
            if(n1 < n2) {
                current.next = new ListNode(n1);
                l1 = l1.next;
            }else{
                current.next = new ListNode(n2);
                l2 = l2.next;
            }
            current = current.next;
        }
        return result.next;
    }
}