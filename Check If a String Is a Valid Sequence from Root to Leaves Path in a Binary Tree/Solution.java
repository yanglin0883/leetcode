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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if(root==null || root.val!=arr[0]) return false;
        return dfs(root, arr, 0);
    }
    boolean dfs(TreeNode root, int[] arr, int cur){
        if(root.left==null&&root.right==null && cur==arr.length-1) return true;
        if(root.left==null&&root.right==null || cur==arr.length-1) return false;
        boolean res= false;
        if(root.left!=null && root.left.val == arr[cur+1]) res = res|| dfs(root.left, arr, cur+1);
        if(root.right!=null && root.right.val == arr[cur+1]) res = res|| dfs(root.right, arr, cur+1);
        return res;
    }
}