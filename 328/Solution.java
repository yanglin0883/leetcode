/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode po = odd;
        ListNode pe = even;
        boolean isOdd = true;
        while(head!=null){
            if(isOdd){
                po.next = head;
                po = po.next;
            }
            else{
                pe.next = head;
                pe = pe.next;
            }
                head = head.next;
            isOdd = !isOdd;
        }
        po.next = even.next;
        pe.next = null;
        return odd.next;
    }
}