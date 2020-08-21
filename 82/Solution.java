/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        long delNum = Long.MAX_VALUE;
        ListNode p = dummy;
        while(p.next!=null&&p.next.next!=null){
            // System.out.println(p.val+"  "+p.next.val+"  "+p.next.next.val+"   "+delNum);
            if(p.next.val==p.next.next.val){
                delNum=p.next.val;
                p.next = p.next.next.next;
            }
            else if(p.next.val == delNum)p.next = p.next.next;
            else p =p.next;
        }
        if(p.next!=null &&p.next.val==delNum) p.next = p.next.next;
        return dummy.next;
    }
}