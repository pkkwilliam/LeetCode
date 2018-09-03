package problem206;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[]args){
        ListNode head = null;
        //head.next = new ListNode(9);

        ListNode result = new Solution().reverseList(head);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
class Solution {
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
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}