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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    TreeNode res =null;
    int max=0;
    int dfs(TreeNode root, int depth){
        if(root==null) return 0;
        if(root.left==null&&root.right==null){
            if(depth>max){
                max = depth;
                res = root;
            }
            return depth;
        }
        int left = dfs(root.left, depth+1);
        int right= dfs(root.right, depth+1);
        if(left==max&&right==max){
            res = root;
        }
        return Math.max(left, right);
    }
}