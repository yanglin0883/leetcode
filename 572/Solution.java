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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        dfs(s, t);
        return res;
    }
    private boolean res = false;
    private void dfs(TreeNode s, TreeNode t){
        if(res) return;
        if(s==null) return;
        res = helper(s,t);
        dfs(s.left, t);
        dfs(s.right, t);
    }
    private boolean helper(TreeNode s, TreeNode t){
        if(s==null&& t==null) return true;
        if(s==null || t==null) return false;
        if(s.val!=t.val) return false;
        return helper(s.left, t.left) && helper(s.right, t.right);
    }
}