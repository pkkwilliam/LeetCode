package leetcode;

import common.ListNode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example:
 * <p>
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode input = ListNode.createNodes(3, 3);
        ListNode result = new RemoveLinkedListElements().removeElements(input, 3);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    // TODO missing testing case, can be better without two while loop
    public ListNode removeElements(ListNode head, int val) {
        int currentNumber = 0;
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.next.val == val) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
            currentNumber++;
        }
        return currentNumber > 0 ? head : null;
    }
}
