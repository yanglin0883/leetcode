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
    public String tree2str(TreeNode t) {
        if(t==null) return "";
        dfs(t);
        return res.toString();
    }
    StringBuilder res = new StringBuilder();
    void dfs(TreeNode root){
        res.append(root.val);
        if(root.left!=null){
            res.append("(");
            dfs(root.left);
            res.append(")");
        }
        else if(root.right!=null){
            res.append("(");
            res.append(")");
        }
        if(root.right!=null){
            res.append("(");
            dfs(root.right);
            res.append(")");
        }
    }
}