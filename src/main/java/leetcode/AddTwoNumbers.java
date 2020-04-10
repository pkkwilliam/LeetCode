package leetcode;

/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

import common.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = recursionHelper(l1, l2);
        return result;
    }
    ListNode recursionHelper(ListNode l1, ListNode l2){
        if(l1.next == null && l2.next == null) {
            return new ListNode(l1.val + l2.val);
        }
        ListNode child = recursionHelper(l1.next != null ? l1.next : l1, l2.next != null ? l2.next : l2);
        l1.val = l1.next != null ? l1.val : 0;
        l2.val = l2.next != null ? l2.val : 0;
        int childValue = child.val;
        int carryValue = childValue / 10;
        child.val = childValue % 10;
        ListNode parent = new ListNode(l1.val + l2.val + carryValue);
        parent.next = child;
        System.out.println(parent.val);
        return parent;
    }
}