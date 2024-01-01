package general;

import util.ListNode;

// https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class _2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        int sum;

        while(l1 != null || l2 != null || carry != 0){
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            ListNode newNode = new ListNode(sum);
            current.next = newNode;
            current = current.next;


            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;

        }

        return head.next;
    }
}