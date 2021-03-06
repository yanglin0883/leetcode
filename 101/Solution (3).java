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
        dfs(root.left, root.right);
        return res;
    }
    boolean res=true;
    void dfs(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return;
        if(root1==null || root2==null){
            res = false;
            return;
        }
        if(root1.val!=root2.val) res = false;
        dfs(root1.left, root2.right);
        dfs(root1.right, root2.left);
    }
}