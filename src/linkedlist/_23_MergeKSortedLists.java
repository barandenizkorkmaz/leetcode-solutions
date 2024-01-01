package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/merge-k-sorted-lists/

public class _23_MergeKSortedLists {
    public boolean isAllNull(ListNode[] lists){
        for(ListNode node : lists){
            if(node != null)return false;
        }
        return true;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode current = head;
        int minIndex = -1;
        int currentMin = Integer.MAX_VALUE;
        while(!isAllNull(lists)){
            currentMin = Integer.MAX_VALUE;
            for(int i = 0 ; i < lists.length; i++){
                if(lists[i] != null){
                    if(lists[i].val < currentMin){
                        minIndex = i;
                        currentMin = lists[i].val;
                    }
                }
            }
            if(head == null){
                head = new ListNode(lists[minIndex].val);
                current = head;
                lists[minIndex] = lists[minIndex].next;
            }
            else{
                ListNode newNode = new ListNode(lists[minIndex].val);
                current.next = newNode;
                current = current.next;
                lists[minIndex] = lists[minIndex].next;
            }

        }
        return head;
    }
}
