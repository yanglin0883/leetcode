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
        if(root==null) return 0;
        int[] res = dfs(root);
        return res[0]-1;
    }
    int[] dfs(TreeNode root){
        int res[] = new int[3]; //; connected: left, right ;;
        if(root==null) return res;
        int[]left = dfs(root.left);
        int[]right= dfs(root.right);
        res[1] = left[2]+1;
        res[2] = right[1]+1;
        res[0] = Math.max(Math.max(res[1],res[2]), Math.max(left[0], right[0]));
        return res;
    }
}