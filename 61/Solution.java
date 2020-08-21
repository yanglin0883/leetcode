/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        ListNode fast = head;
        int n=0;
        while(fast!=null) {
            n++;
            fast = fast.next;
        }
        k %= n; 
        if(k==0) return head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        fast = slow;
        while(fast.next!=null){
            if(k==0) break;
            k--;
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = head;
        return res;
    }
}