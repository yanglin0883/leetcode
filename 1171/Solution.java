/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        T1:while(p.next!=null){
            ListNode q = p.next;
            int sum =0;
            while(q!=null){
                sum += q.val;
                if(sum==0){
                    p.next = q.next;
                    continue T1;
                }
                q = q.next;
            }
            p = p.next;
        }
        return dummy.next;
    }
}