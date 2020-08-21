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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = p.val, b = q.val;
        if(a>b){a=q.val;b = p.val;}
         return dfs(root, a, b);
    }
    TreeNode dfs(TreeNode root, int a, int b){
        if(root==null) return null;
        if(root.val>=a &&root.val<=b) return root;
        if(root.val>b) return dfs(root.left, a, b);
        else if(root.val<a) return dfs(root.right, a, b);
        return null;
    }
}