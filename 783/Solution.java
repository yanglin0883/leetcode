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
    public int minDiffInBST(TreeNode root) {
        dfs(root);
        return (int)min;
    }
    long min=Long.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    void dfs(TreeNode root){
        if(root ==null) return;
        dfs(root.left);
        if(pre != Integer.MAX_VALUE){
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }
}