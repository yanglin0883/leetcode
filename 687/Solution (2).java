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
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return path-1;
    }
    int path=0;
    int[] dfs(TreeNode root){
        if(root.left==null&&root.right==null) {
            path = Math.max(path, 1);
            return new int[]{root.val, 1};}
        int[]res = {root.val, 1};
        int max=0,maxP=0;
        // System.out.println(max+" "+maxP+"  "+Arrays.toString(res));
        if(root.left!=null){
            int[]left = dfs(root.left);
            if(left[0]==res[0]) {
                max = Math.max(max, left[1]);
                maxP = left[1]+1;
            }
        }
        if(root.right!=null){
            int[]right = dfs(root.right);
            if(right[0]==res[0]) {
                max = Math.max(max, right[1]);
                maxP +=right[1];
            }
        }
        res[1] += max;
        
        // System.out.println(max+" "+maxP+"  "+Arrays.toString(res));
        path = Math.max(Math.max(path, maxP), res[1]);
        
        return res;
    }
}