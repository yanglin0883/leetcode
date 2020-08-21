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
    public int maxProduct(TreeNode root) {
        dfs1(root);
        totalSum = sum;
        dfs2(root);
        return (int)(product % 1000000007);
    }
    int sum =0, totalSum=0;
    long product=0;
    void dfs1(TreeNode root){
        if(root == null) return;
        sum += root.val;
        dfs1(root.left);
        dfs1(root.right);
    }
    void dfs2(TreeNode root){
        if(root == null) return;
        sum=0;
        dfs1(root);
        long sum1 = (long)sum;
        long sum2 = (long)totalSum - sum1;
        product = Math.max(product, sum1 * sum2);
        dfs2(root.left);
        dfs2(root.right);
    }
}