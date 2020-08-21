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
    public int longestUnivaluePath(TreeNode root) {
        if(root ==null) return 0;
        int res[] = dfs(root);
        return res[0];
    }
    int[] dfs(TreeNode root){
        if(root == null) return null;
        int left[] = dfs(root.left), right[] = dfs(root.right);
        int res[] = new int[2];
        if(left==null&&right==null) return res;
        if(left==null){
            if(root.val == root.right.val){
                res[0] = Math.max(right[0],1+right[1]);
                res[1] = right[1]+1;
            }
            else {
                res[0] = right[0];
                res[1] = 0;
            }
        }
        else if(right==null){
            if(root.val == root.left.val){
                res[0] = Math.max(left[0],1+left[1]);
                res[1] = left[1]+1;
            }
            else {
                res[0] = left[0];
                res[1] = 0;
            }
        }
        else{
            if(root.val!=root.left.val && root.val!=root.right.val){
                res[0] = Math.max(left[0], right[0]);
                res[1] = 0;
            }
            else if(root.val == root.left.val && root.val == root.right.val){
                res[0] = Math.max(Math.max(left[0], right[0]), left[1]+right[1]+2);
                res[1] = Math.max(left[1], right[1])+1;
            }
            else if(root.val == root.left.val){
                res[0] = Math.max(Math.max(left[0],1+left[1]), right[0]);
                res[1] = left[1]+1;
            }  
            else{
                res[0] = Math.max(Math.max(right[0],1+right[1]), left[0]);
                res[1] = right[1]+1;
            }
        }
        return res;
    }
}