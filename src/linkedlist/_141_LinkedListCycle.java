package linkedlist;

// https://leetcode.com/problems/linked-list-cycle/

import util.ListNode;

public class _141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)return false;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            if(slow == fast)return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}
