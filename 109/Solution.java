/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode fast = head, slow = head;
        ListNode preSlow = new ListNode(0);
        preSlow.next = slow;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            preSlow = slow;
            slow = slow.next;
        }
        TreeNode mid = new TreeNode(slow.val);
        mid.right = sortedListToBST(slow.next);
        preSlow.next=null;
        mid.left = sortedListToBST(head);
        return mid;
    }
    
    
}