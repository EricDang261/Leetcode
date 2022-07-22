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
        while(headA != null){
            ListNode ptrB = headB;
            while(ptrB != null){
                if(ptrB == headA) return headA;
                ptrB = ptrB.next; 
            }
            // increment A
            headA = headA.next;
        }
        return null;
    }
}