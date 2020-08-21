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
    public int maxSumBST(TreeNode root) {
        int[] res = dfs(root);        
        return max;
    }
    int max=0;
    int[] dfs(TreeNode root){
        int[] res = new int[4];
        if(root==null) {
            res[0] =1;
            res[1] = Integer.MAX_VALUE;
            res[2] = Integer.MIN_VALUE;
            res[3] = 0;
            return res;
        }
        if(root.left==null&&root.right==null){
            res[0]=1;res[1]=root.val;res[2]=root.val;res[3]=root.val;
            max = Math.max(max, res[3]);
            return res;
        }
        int[]left = dfs(root.left);
        int[]right = dfs(root.right);
        if(left[0]==1&&right[0]==1 && left[2]<root.val && right[1]>root.val) res[0]=1;
        res[3] = left[3]+right[3]+root.val;
        res[1] = Math.min(root.val, left[1]);
        res[2] = Math.max(root.val, right[2]);
        if(res[0]==1) max = Math.max(max, res[3]);
        return res;
    }
}