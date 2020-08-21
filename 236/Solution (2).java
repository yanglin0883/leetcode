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
        dfs(root, p, q);
        return res;
    }
    TreeNode res=null;
    int dfs(TreeNode root, TreeNode p, TreeNode q){
        if(root==null || res!=null) return 0;
        int r=0;
        int left = dfs(root.left, p, q);
        int right = dfs(root.right, p, q);
        r += left+right;
        if(root==p) r+=10;
        if(root==q) r+=1;
        if(r==11){res = root;return 0;}
        return r;
    }
}