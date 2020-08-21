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
        // System.out.println(closest+"  "+sum);
        return (int)(((long)closest*(totalSum - closest)) % 1000000007);
    }
    int sum =0, totalSum=0;
    int closest =0;
    void dfs1(TreeNode root){
        if(root == null) return;
        sum += root.val;
        dfs1(root.left);
        dfs1(root.right);
    }
    int dfs2(TreeNode root){
        if(root == null) return 0;
        int left = dfs2(root.left);
        int right = dfs2(root.right);
        if(dif(right) <dif(closest)) closest = right;
        if(dif(left) < dif(closest)) closest = left;
        return root.val + left + right;
    }
    int dif(int n){
        return Math.abs(totalSum - 2*n);
    }
}