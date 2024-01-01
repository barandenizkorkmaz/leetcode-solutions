package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class _83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode tmp = null;
        int prev = -101;
        while(current != null){
            tmp = current;
            while(tmp != null && tmp.val == current.val){
                tmp = tmp.next;
            }
            current.next = tmp;
            prev = current.val;
            current = current.next;
        }
        return head;
    }
}
