/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int n = getSize(root);
        ListNode[] res= new ListNode[k];
        ListNode head = root;
        for(int i=0;i<k;i++){
            res[i] = head;
            int j=(i<n%k)?0:1;
            for(;j<n/k;j++)
                head = head.next;
            if(head!=null){ListNode next = head.next;
            head.next = null;
            head = next;}
        }
        return res;
    }
    int getSize(ListNode root){
        int total=0;
        for(ListNode head = root; head!=null; head = head.next) total++;
        return total;
    }
}