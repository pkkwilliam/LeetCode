package leetcode;

import common.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.add(head.val);
            head = head.next;
        }
        ListNode result = new ListNode(0), current = result;
        while(!stack.isEmpty()){
            current.next = new ListNode(stack.pop());
            current = current.next;
        }
        return result.next;
    }
}