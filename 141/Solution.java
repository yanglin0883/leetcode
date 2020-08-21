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
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        HashSet<ListNode> nodes = new HashSet<ListNode>();//这里不用Array list是因为hash快
        ListNode i = head;
        while(i.next!=null){
            if(nodes.contains(i)) return true;
            nodes.add(i);
            i = i.next;
        }
        return false;
    }
}