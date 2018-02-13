/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

package problem2;

public class AddTwoNumbers {
    public static void main(String[]args){
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(8);
        //n1.next.next = new ListNode(3);

        ListNode n2 = new ListNode(0);
        //n2.next = new ListNode(6);
        //n2.next.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(n1,n2);
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), current = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int number1 = (l1 != null) ? l1.val : 0;
            int number2 = (l2 != null) ? l2.val : 0;
            int sum = number1 + number2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        current.next = (carry != 0) ? new ListNode(carry) : null;
        return result.next;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}