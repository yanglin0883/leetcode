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
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] xDepth = dfs(root, x, 0);
        int[] yDepth = dfs(root, y, 0);
        if(xDepth==null || yDepth==null) return false;
        if(xDepth[0] == yDepth[0] &&xDepth[1] != yDepth[1]) return true;
        else return false;
    }
    int[] dfs(TreeNode root, int x, int depth){
        if(root==null) return null;
        if(root.left!=null&& root.left.val==x || root.right!=null&&root.right.val==x){
            int[] res = {depth, root.val};
            return res;
        }
        int[] left = dfs(root.left, x, depth+1);
        if(left!=null) return left;
        int[] right = dfs(root.right, x, depth+1);
        return right;
    }
}