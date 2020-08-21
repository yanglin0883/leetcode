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
        int ans = toNum(l1)+toNum(l2);
        return toList(ans);
    }
    int toNum(ListNode l1){
        int n=0;
        while(l1!=null){
            n*=10;
            n+=l1.val;
            l1 = l1.next;
        }
        return n;
    }
    ListNode toList(int a){
        ListNode dummy = new ListNode(0);
        if(a==0) return dummy;
        ListNode temp  =dummy;
        while(a!=0){
            temp = new ListNode(a%10);
            temp.next = dummy.next;
            a/=10;
            dummy.next = temp;
        }
        return dummy.next;
    }
}