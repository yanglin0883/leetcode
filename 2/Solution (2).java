/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode i1=l1, i2=l2, i=res;
        int carry=0;
        while(i1!=null || i2!=null){            
            int r = carry ;
            if(i1==null){
                r += i2.val;
                i2 = i2.next;
            }else if(i2==null){
                r += i1.val ;
                i1=  i1.next;
            }else{
                r+= i1.val + i2.val;
                i1 = i1.next;
                i2 = i2.next;
            }
                carry = r/10;
                r = r%10;
            i.next = new ListNode(r);
            i = i.next;
        }
        if(carry!=0) i.next = new ListNode(carry);
        return res.next;
    }
}