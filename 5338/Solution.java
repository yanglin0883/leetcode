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
    public int longestZigZag(TreeNode root) {
        dfs(root);
        return max;
    }
    int max=0;
    int dfs(TreeNode root){
        if(root==null) return;
        int len = zig(root,0);
        max = Math.max(len, max);
        dfs(root.left);
        dfs(root.right);
    }
    int zig(TreeNode root, int d){
        int len=0;
        if(d<=0 && root.left!=null) len = Math.max(len, 1+zig(root.left, 1));
        if(d>=0 && root.right!=null) len = Math.max(len, 1+zig(root.right, -1));
        return len;
    }
}