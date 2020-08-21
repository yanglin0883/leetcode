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
    public TreeNode increasingBST(TreeNode root) {        
        dfs(root);
        return res.right;
    }
    TreeNode res = new TreeNode(0);
    TreeNode temp = res;
    private void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        dfs(root.right);        
    }
}