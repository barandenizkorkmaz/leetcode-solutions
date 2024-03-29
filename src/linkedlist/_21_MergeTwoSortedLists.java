package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class _21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode cur = head;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;

        return head.next;
    }
}
