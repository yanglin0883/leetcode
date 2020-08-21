/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode p = dummy;
        while(p.next!=null){
            if(p.next.val<p.val){
                ListNode p1 = dummy;
                while(p1.next.val<p.next.val) p1 = p1.next;
                ListNode temp = p.next;// delete
                p.next = temp.next;
                temp.next = p1.next;// insert
                p1.next = temp;
            }
            else
                p = p.next;
        }
        return dummy.next;
    }
}