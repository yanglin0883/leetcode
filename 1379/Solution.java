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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        tar = target;
        dfs(original, cloned);
        return res;
    }
    TreeNode tar, res;
    void dfs(TreeNode root, TreeNode r){
        if(root==null || res !=null) return;
        if(root==tar) res = r;
        dfs(root.left, r.left);
        dfs(root.right, r.right);
    }
}