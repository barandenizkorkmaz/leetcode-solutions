package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list

public class _2095_DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        int index = size / 2;
        if(index == 0){
            head = null;
            return head;
        }
        current = head;
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
}
