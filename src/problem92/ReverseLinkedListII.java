/*
Reverse a linked list from position m to n. Do it in one-pass.

Note: 1 ≤ m ≤ n ≤ length of list.

Example:

Input: 1->2->3->4->5->NULL, m = 2, n = 4
Output: 1->4->3->2->5->NULL
 */
package problem92;

public class ReverseLinkedListII {
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



        ListNode result = new Solution().reverseBetween(head,1,5);

        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode result = null;
        int currentCount = 0;
        return null;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}