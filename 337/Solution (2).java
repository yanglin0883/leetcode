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
    public int rob(TreeNode root) {
        int[] res= dp(root);
        return Math.max(res[0], res[1]);
    }
    
    int[] dp(TreeNode root){
        if(root==null) return new int[2];
        int[] left = dp(root.left);
        int[] right =dp(root.right);
        int[] res = new int[2];
        res[0] = root.val+left[1]+right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0],right[1]);
        return res;
    }
}