package leetcode;

import common.ListNode;

import java.util.LinkedList;

/**
 *
 * Name: Ka Kei Pun
 * Date: 10/28/2018
 * Version: V1.0.0
 *
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 */

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args){
        ListNode.printNode(new RemoveNthNodeFromEndofList().removeNthFromEnd(ListNode.createNodes(1), 1));
    }
    // TODO missing test cases
    public ListNode removeNthFromEnd(ListNode head, int n) {
        LinkedList<ListNode> nodes = new LinkedList<>();
        ListNode current = head;
        while(current != null){
            nodes.add(current);
            if(nodes.size() > n + 1){
                nodes.poll();
            }
            current = current.next;
        }
        if(n >= nodes.size()){
            return head.next;
        }
        ListNode before = nodes.pollFirst();
        ListNode remove = nodes.pollFirst();
        before.next = remove.next;
        return head;
    }
    // Two pointer, better time complexity and space complexity!!!
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode current = head, remove = head;
        while(n-- > 0)
            current = current.next;
        while(current != null){
            current = current.next;
            remove = remove.next;
        }
        return remove.next = remove.next.next;
    }
}
