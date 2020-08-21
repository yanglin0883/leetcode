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
    public TreeNode pruneTree(TreeNode root) {
        if(dfs(root))
        return root;
        return null;
    }
    boolean dfs(TreeNode root){
        if(root==null) return false;
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        if(!left) root.left = null;
        if(!right) root.right=null;
        if(root.val==1) return true;
        else return left||right;
    }
}