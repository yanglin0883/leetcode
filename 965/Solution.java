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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        val=root.val;
        dfs(root);
        return res;
    }
    boolean res=true;
    int val;
    void dfs(TreeNode root){
        if(!res) return;
        if(root.val!=val){
            res=false;
            return;
        }
        if(root.left!=null) dfs(root.left);
        if(root.right!=null) dfs(root.right);
    }
}