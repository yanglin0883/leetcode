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
        HashSet<ListNode> nodes = new HashSet<ListNode>();//���ﲻ��Array list����Ϊhash��
        ListNode i = head;
        while(i.next!=null){
            if(nodes.contains(i)) return true;
            nodes.add(i);
            i = i.next;
        }
        return false;
    }
}