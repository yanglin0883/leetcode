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
        if(l1==null||l1.val==0)return l2;
        if(l2==null||l2.val==0) return l1;
        ArrayList<Integer> a1 = new ArrayList();
        for(ListNode i = l1;i!=null; i=i.next){
            a1.add(i.val);
        }
        ArrayList<Integer> a2 = new ArrayList();
        for(ListNode i = l2;i!=null; i=i.next){
            a2.add(i.val);
        }
        // System.out.println(a1);
        // System.out.println(a2);
        int a= a1.size()-1, b = a2.size()-1, carry=0;
        ListNode res = new ListNode(0);
        while(a>=0 ||b>=0){
            int temp = carry;
            if(a<0){
                temp += a2.get(b--);
            }else if(b<0){
                temp += a1.get(a--);
            }else temp += a1.get(a--)+a2.get(b--);
            carry = temp/10;
            temp %=10;
            // System.out.println(temp+" "+carry);
            ListNode t = res.next;
            res.next = new ListNode(temp);
            res.next.next = t;
        }
        if(carry>0){            
            ListNode t = res.next;
            res.next = new ListNode(1);
            res.next.next = t;
        }
        return res.next;
    }
}