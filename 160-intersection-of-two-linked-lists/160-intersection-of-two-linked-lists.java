/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        while(ptr1 != ptr2){
            if(ptr1 == null) ptr1 = headB;
            else
                ptr1 = ptr1.next;
            if(ptr2 == null) ptr2 = headA;
            else    
                ptr2 = ptr2.next;
        }
        return ptr1;
    }
}