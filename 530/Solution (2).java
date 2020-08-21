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
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }
    int res = Integer.MAX_VALUE;
    int[] dfs(TreeNode root){
        if(root == null) return null;
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        if(left==null){
            if(right==null){
                return new int[]{root.val, root.val};
            }else{
                res = Math.min(res, right[0]-root.val);
                return new int[]{root.val, right[1]};
            }
        }else{
            if(right==null){
                res = Math.min(res, root.val-left[1]);
                return new int[]{left[0], root.val};
            }else{
                res = Math.min(res, Math.min(root.val-left[1], right[0]-root.val));
                return new int[]{left[0], right[1]};
            }
        }
    }
}