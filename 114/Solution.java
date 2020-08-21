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
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.left);
        flatten(root.right);
        if(root.left==null) return;
        TreeNode temp = rightMost(root.left);
        temp.right = root.right;
        root.right = root.left;
        root.left = null;        
    }
    
    TreeNode rightMost(TreeNode root){
        if(root.right ==null) return root;
        else return rightMost(root.right);
    }
}