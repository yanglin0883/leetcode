/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> g = new HashSet<>();
        for(int i=0;i<G.length;i++){
            g.add(G[i]);
        }
        int res=0;
        while(head!=null){
            if(g.contains(head.val)){
                res++;
                while(head!=null&&g.contains(head.val))
                    head = head.next;
            }
            else head = head.next;
        }
        return res;
    }
}