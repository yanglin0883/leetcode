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
    TreeNode res = null;
    boolean dfs(TreeNode root, TreeNode p, TreeNode q){
        if(res!=null||root==null) return false;
        boolean current=false;
        if(root==p ||root==q) current = true;
        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right,p,q);
        
        if((left&&right)||(left&&current)||(right&&current)) res = root;
        return current||left||right;
    }
}