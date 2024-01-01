package linkedlist;

import util.ListNode;

// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class _160_IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        while(currentA != null){
            while(currentB != null){
                if(currentA == currentB){
                    return currentB;
                }
                currentB = currentB.next;
            }
            currentA = currentA.next;
            currentB = headB;
        }
        return null;
    }
}
