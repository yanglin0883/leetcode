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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = head.next;
        dummy.next.next = null;
        while(head!=null){            
            ListNode p = dummy;
            for(;p.next!=null;p = p.next){
                if(p.next.val>=head.val) break;
            }
            ListNode next = head.next;
            head.next = p.next;
            p.next = head;
            head = next;
        }
        return dummy.next;
    }
}