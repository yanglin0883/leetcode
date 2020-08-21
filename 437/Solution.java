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
    public int pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return res;
    }
    private void dfs(TreeNode root, int sum){
        if(root==null) return;
        sum(root, 0, sum);
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    int res;
    private void sum(TreeNode root, int sum, int target){
        if(root==null) return;
        sum+=root.val;
        if(sum==target) res++;
        sum(root.left, sum, target);
        sum(root.right, sum, target);
    }
}