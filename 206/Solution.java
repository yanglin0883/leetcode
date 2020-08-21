/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode res =null;
        while(head!=null){
            ListNode t = head.next;
            head.next = res;
            res = head;
            head = t;
        }
        return res;
    }
}