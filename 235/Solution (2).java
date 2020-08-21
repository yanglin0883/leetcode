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
    boolean[] dfs(TreeNode root, TreeNode p, TreeNode q){
        boolean[] r = new boolean[2];
        if(root==null) return r;
        boolean[] left = dfs(root.left, p, q);
        boolean[] right = dfs(root.right, p, q);
        r[0] = left[0]||right[0]||root==p;
        r[1] = left[1] || right[1]||root==q;
        if(r[1]&&r[0]) {
            res = root;
            r[0] = false;
            r[1] = false;
        }
        return r;
    }
}