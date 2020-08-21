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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) 
            return false;
        target = sum;
        dfs(root, 0);
        return res;
    }
    int target;
    boolean res = false;
    void dfs(TreeNode root, int lastLevel){
        if(res) return;
        lastLevel = lastLevel+ root.val;
        if(root.left==null&&root.right==null){
            res = lastLevel==target;
        }
        else{
            if(root.left!=null) dfs(root.left, lastLevel);
            if(root.right!=null) dfs(root.right, lastLevel);
        }
    }
}