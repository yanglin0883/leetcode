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
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }
    int sum=0;
    void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.right);
        sum+=root.val;
        root.val = sum;
        dfs(root.left);
    }
}