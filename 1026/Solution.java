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
    public int maxAncestorDiff(TreeNode root) {
        int[] res = dfs(root);
        return res[0];//0:difference;  1:min;   2:max;
    }
    int[] dfs(TreeNode root){
        int[] res = {-1,Integer.MAX_VALUE, Integer.MIN_VALUE};
        if(root==null) return res;
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        res[1] = Math.min(Math.min(left[1], right[1]), root.val);
        res[2] = Math.max(Math.max(left[2], right[2]), root.val);
        res[0] = Math.max(Math.max(root.val-res[1], res[2]-root.val),Math.max(left[0], right[0]));
        return res;
    }
}