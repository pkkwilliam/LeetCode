package leetcode;

import common.ListNode;

/**
 * Author: Ka Kei Pun
 * Date: 1/17/20
 * Version: 1.0.0
 */

public class SwapNodesinPairs {
  public ListNode swapPairs(ListNode head) {
    ListNode resultHead = new ListNode(0);
    ListNode currentHead = resultHead;
    while (head != null) {
      if (head.next == null) {
        currentHead.next = new ListNode(head.val);
        head = head.next;
      } else {
        currentHead.next = new ListNode(head.next.val);
        currentHead.next.next = new ListNode(head.val);
        currentHead = currentHead.next.next;
        head = head.next.next;
      }
    }
    return resultHead.next;
  }
}
