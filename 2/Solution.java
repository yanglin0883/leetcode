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
        ListNode ans = new ListNode(0);
        int carriedNumber= 0;
        ListNode ansP = ans;
        while(l1!=null&&l2!= null){
            int digit = carriedNumber +l1.val+l2.val;
            if(digit>9){
                carriedNumber=1;
                digit-=10;
            }
            else{
                carriedNumber=0;
            }
            ansP.next=new ListNode(digit);
            l1=l1.next;
            l2=l2.next;
            ansP=ansP.next;
        }
        if(l2==null)
        while(l1!=null){
            int digit = carriedNumber +l1.val;
            if(digit>9){
                carriedNumber=1;
                digit-=10;
            }
            else{
                carriedNumber=0;
            }            
            ansP.next=new ListNode(digit);
            l1=l1.next;
            ansP=ansP.next;
        }
        if(l1==null)
        while(l2!=null){
            int digit = carriedNumber +l2.val;
            if(digit>9){
                carriedNumber=1;
                digit-=10;
            }
            else{
                carriedNumber=0;
            }            
            ansP.next=new ListNode(digit);
            l2=l2.next;
            ansP=ansP.next;
        }
        if(carriedNumber==1) ansP.next=new ListNode(1);
        return ans.next;
    }
}