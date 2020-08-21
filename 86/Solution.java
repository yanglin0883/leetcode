/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode pl = left, pr=right;
        while(head!=null){
            //System.out.println(head.val);
            if(head.val<x){
                pl.next = head;
                pl = pl.next;
            }
            else{
                pr.next = head;
                pr = pr.next;
            }
            head = head.next;
        }
        pr.next = null;
        pl.next = right.next;
        return left.next;
    }
}