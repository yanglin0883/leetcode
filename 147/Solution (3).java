/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return null;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode p = dummy;
        p.next =  head;
        while(p.next!=null){
            if(p.next.val<p.val){
                ListNode temp = dummy;
                while(temp.next.val<p.next.val) temp = temp.next;
                ListNode next = p.next.next;
                p.next.next = temp.next;
                temp.next = p.next;
                p.next = next;
            }else 
                p = p.next;
        }
        return dummy.next;
    }
}