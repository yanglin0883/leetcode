/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        // ListNode h1 = new ListNode(0);
        // ListNode h2 = new ListNode(0);
        // h1.next=l1;
        // h2.next=l2;
        // ListNode p1 = h1;
        // ListNode p2 = h2;
        ListNode ans = new ListNode(0);
        ListNode pointer = ans;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                pointer.next= new ListNode(l1.val);
                l1 = l1.next;                
            }
            else {
                pointer.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
        if(l1!=null){
            while(l1!=null){
                pointer.next= new ListNode(l1.val);
                l1 = l1.next;
                pointer = pointer.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                pointer.next= new ListNode(l2.val);
                l2 = l2.next;
                pointer = pointer.next;
            }
        }
        return ans.next;
    }
}