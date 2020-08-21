/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        if(head==null) return new int[0];
        int size = getSize(head);
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            int val = head.val;
            for(ListNode p =head;p!=null;p = p.next){
                if(p.val>val) {val = p.val;break;}
            }
            if(val>head.val) res[i] = val;
            head = head.next;
        }
        return res;
    }
    int getSize(ListNode head){
        if(head==null) return 0;
        int res =0;
        for(;head!=null;head = head.next) res++;
        return res;
    }
}