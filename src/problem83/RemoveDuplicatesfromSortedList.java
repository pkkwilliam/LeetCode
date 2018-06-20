
/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2
Example 2:

Input: 1->1->2->3->3
Output: 1->2->3
 */
package problem83;

import java.util.List;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[]args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(3);



        ListNode result = new Solution().deleteDuplicates(head);

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

class Solution {
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
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}