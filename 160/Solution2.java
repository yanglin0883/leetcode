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
        if(headA==null||headB==null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        ListNode endA=new ListNode(0);
        ListNode endB=new ListNode(0);
        while(pA!=null&&pB!=null){
            if(pA==pB) return pA;
            if(endA.next!=null&&endB.next!=null&&endA.next!=endB.next) 
                return null;                        
            pA = next(pA,headB,endA);
            pB = next(pB,headA,endB);
        }
        return pA;
    }
    private ListNode next(ListNode pA, ListNode headB, ListNode endA){
        if(pA.next!=null) return pA.next;
        else{
            if(endA.next==null){
                endA.next = pA;
                return headB;
            }
            else
                return null;
        }
    }
}