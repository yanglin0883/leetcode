/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while(m>1){
            pre = pre.next;
            m--;
            n--;
        }
        ListNode post = pre;
        while(n>0){
            post = post.next;
            n--;
        }
        ListNode start = pre.next;
        ListNode end = post;
        post = post.next;
        //System.out.println(pre.val+"  "+ post);
        
        ListNode node = start;
        ListNode p = null;
        
        while(node!=post){
            ListNode temp = node.next;
            node.next = p;
            p = node;
            node = temp;
        }
        
        pre.next = end;
        start.next = post;
        //System.out.println(start.val+" "+end.val);
        return dummy.next;
    }
}