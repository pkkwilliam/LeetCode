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

package problem21;

public class MergeTwoSortedLists {
    public static void main(String[]args){
        ListNode l1 = new ListNode(0),
                l2 = new ListNode(0),
                current1 = l1,
                current2 = l2;
        int[] test1 = {1,2,4}, test2 = {1,3,4};
        for(int i = 0; i < test1.length; i++){
            current1.next = new ListNode(test1[i]);
            current2.next = new ListNode(test2[i]);
            current1 = current1.next;
            current2 = current2.next;
        }
        ListNode result = new Solution().mergeTwoLists(l1.next,l2.next);
        while(result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}

class Solution {
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
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}