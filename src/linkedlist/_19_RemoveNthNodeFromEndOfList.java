package linkedlist;

import util.ListNode;

public class _19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)return head;
        ListNode slow = head;
        ListNode fast =  head;
        int i = 0;
        while(fast != null && i < n){
            fast = fast.next;
            i++;
        }
        if(i != n)return head; // list not long enough to make any deletion
        if(fast == null)return head.next; // head is the one to delete
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // slow.next is the one to delete now.
        slow.next = slow.next.next;
        return head;
    }
}
