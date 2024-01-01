package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/

public class _879_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null)return null;
        if(head.next == null)return head;
        ListNode first = head;
        ListNode second = head.next;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return second == null ? first : first.next;
    }
}
