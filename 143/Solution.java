/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        
        ListNode mid = head;
        ListNode fast = head.next;
        while(fast!=null&&fast.next!=null){
            mid = mid.next;
            fast = fast.next.next;
        }
        
        //reverse back half
        ListNode head2 = mid.next;
        mid.next = null;
        // ListNode dummy = new ListNode(0);
        // dummy.next = head2;
        ListNode pre = null;
        while(head2!=null){
            ListNode temp = head2.next;
            head2.next = pre;
            pre = head2;
            head2 = temp;
        }
        //print(pre);
        //merge pre and head;
        ListNode node = head;
        while(pre!=null){
            ListNode temp =  pre.next;
            pre.next = node.next;
            node.next = pre;
            node = pre.next;
            pre = temp;
        }
//         if(node.next==null) node.next = pre;
        
    }
    void print(ListNode head){
        while(head!=null){
            System.out.print(head.val+"  ");
            head = head.next;
        }
        System.out.println();
    }
}