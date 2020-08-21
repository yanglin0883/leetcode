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
    public int maxPathSum(TreeNode root) {
        return dfs(root)[0];
    }
    int[] dfs(TreeNode root){
        if(root.left==null && root.right==null) return new int[]{root.val, root.val};
        int[] left = {root.val,0};
        int[]right = {root.val, 0};
        if(root.left!=null){
            left = dfs(root.left);
        }
        if(root.right!=null){
            right = dfs(root.right);
        }
        int max=0;
        max = Math.max(max, Math.max(left[1], right[1]));
        int[] res = {root.val,root.val+max};
        if(left[1]>0) res[0]+=left[1];
        if(right[1]>0)res[0] +=right[1];
        res[0] = Math.max(res[0], Math.max(left[0], right[0]));
        // System.out.println("left: "+Arrays.toString(left)+" right:"+Arrays.toString(right)+"res"+Arrays.toString(res));
        return res;
    }
}