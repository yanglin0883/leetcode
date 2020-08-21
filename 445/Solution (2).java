/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0) return l2;
        if(l2.val==0) return l1;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        while(l1!=null){
            //ListNode temp = l1.next;
            ListNode t = dummy1.next;
            dummy1.next = l1;
            l1 =l1.next;
            dummy1.next.next = t;
        }
        while(l2!=null){
            //ListNode temp = l1.next;
            ListNode t = dummy2.next;
            dummy2.next = l2;
            l2 =l2.next;
            dummy2.next.next = t;
        }
        ListNode dummy = new ListNode(0);
        ListNode p1=dummy1.next, p2=dummy2.next, p=dummy;
        boolean carried=false;
        while(p1!=null&&p2!=null){
            int ans = p1.val+p2.val;
            if(carried) ans++;
            if(ans>9){
                carried = true;
                ans-=10;
            }else carried = false;
            p = dummy.next;
            dummy.next = new ListNode(ans);
            dummy.next.next = p;
            p1 = p1.next;
            p2 = p2.next;
        }
        while(p1!=null){
            int ans = p1.val;
            if(carried) ans++;
            if(ans>9){
                carried = true;
                ans-=10;
            }else carried = false;
            p = dummy.next;
            dummy.next = new ListNode(ans);
            dummy.next.next = p;
            p1 = p1.next;
        }
        while(p2!=null){
            int ans = p2.val;
            if(carried) ans++;
            if(ans>9){
                carried = true;
                ans-=10;
            }else carried = false;
            p = dummy.next;
            dummy.next = new ListNode(ans);
            dummy.next.next = p;
            p2 = p2.next;
        }
        if(carried){
            p = dummy.next;
            dummy.next = new ListNode(1);
            dummy.next.next = p;
        }
        return dummy.next;
    }
}