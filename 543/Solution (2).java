/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return dfs(root)[0];
    }
    
    int[] dfs(TreeNode root){
        int[]res =  new int[2];
        if(root.left==null&&root.right==null) return res;
        if(root.left!=null && root.right!=null){
            int[] left = dfs(root.left);
            int[]right = dfs(root.right);
            res[1] = 1+Math.max(left[1], right[1]);
            res[0] = Math.max(Math.max(left[0], right[0]), left[1]+right[1]+2);
        }else if(root.left==null){
            int[]right = dfs(root.right);
            res[1] = 1+right[1];
            res[0] = Math.max(right[0], res[1]);
        }else{
            int[]left = dfs(root.left);
            res[1] = 1+left[1];
            res[0] = Math.max(left[0], res[1]);
        }
        return res;
    }
}