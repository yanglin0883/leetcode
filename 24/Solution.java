/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while(p.next!=null&&p.next.next!=null){
            ListNode next = p.next;
            p.next = next.next;
            next.next = next.next.next;
            p.next.next = next;
            p = next;
        }
        return dummy.next;
    }
}