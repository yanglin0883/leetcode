/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        ListNode i = head;
        while(i!=null){
            if(nodes.contains(i)) return i;
            nodes.add(i);
            i=i.next;
        }
        return null;
    }
}