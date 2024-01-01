package linkedList;

// https://leetcode.com/problems/remove-linked-list-elements/

import util.ListNode;

public class _203_RemoveLinkedList_Elements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode cur = head;
        ListNode prev = null;

        while(cur != null){
            if(cur.val == val){ //delete
                if(prev == null){
                    head = cur.next;
                    cur = cur.next;
                }
                else{
                    prev.next = cur.next;
                    cur = prev.next;
                }
            }
            else{
                prev = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
