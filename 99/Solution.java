/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        inorder(root);
        // System.out.println(first.val+"  "+second.val);
        int temp = second.val;
        second.val = first.val;
        first.val = temp;
    }
    TreeNode first, second, prev;
    void inorder(TreeNode root){
        if(root==null) return ;
        inorder(root.left);
        if(prev!=null && prev.val >root.val){
            if(first==null) first = prev;
            second = root;
        }
        prev = root;
        
        inorder(root.right);
    }
}