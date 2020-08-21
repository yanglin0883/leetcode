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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        Deque<TreeNode> deque = new LinkedList();
        deque.addFirst(root.left);
        deque.addLast(root.right);
        
        while(!deque.isEmpty()){
            TreeNode head = deque.pollFirst();
            TreeNode tail = deque.pollLast();
            if(head==null&&tail==null) continue;
            if(head==null||tail==null) return false;
            if(head.val!=tail.val) return false;
            deque.addFirst(head.left);
            deque.addFirst(head.right);
            deque.addLast(tail.right);
            deque.addLast(tail.left);
        }
        return true;
    }
}