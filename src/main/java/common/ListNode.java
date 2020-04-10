package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Ka Kei Pun
 * Last Update: 10/17/2018
 * Version: 1.0.0
 */

public class ListNode {
    public String s;
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    /**
     * @param input
     * @return head of ListNode object
     */
    public static ListNode createNodes(int... input) {
        if (input == null) {
            return null;
        }
        int count = 0;
        ListNode head = new ListNode(input[count++]);
        ListNode current = head;
        while (count < input.length) {
            current.next = new ListNode(input[count]);
            current = current.next;
            count++;
        }
        return head;
    }

    public static int[] convertNodeToArray(ListNode root) {
        List<Integer> values = new ArrayList<>();
        while (root != null) {
            values.add(root.val);
            root = root.next;
        }
        int[] result = new int[values.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = values.get(i);
        }
        return result;
    }

    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
