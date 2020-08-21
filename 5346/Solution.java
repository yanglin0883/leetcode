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
    ListNode target;
    public boolean isSubPath(ListNode head, TreeNode root) {
        target = head;
        dfs(root);
        return res;
    }
    boolean res = false;
    void dfs(TreeNode head){
        if(head==null)return;
        if(res) return;
        if(head.val==target.val) check( head);
        dfs(head.left);
        dfs(head.right);
    }
    void check(TreeNode root){
        res = dfs2(root, target);
    }
    boolean dfs2(TreeNode root, ListNode node){
        if(node.next==null) return true;
        
         return root.left!=null&&(root.left.val==node.next.val)&&dfs2(root.left, node.next) || 
             root.right!=null&&(root.right.val==node.next.val)&&dfs2(root.right, node.next);
    }
}