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
    public int goodNodes(TreeNode root) {
        dfs(root,-100001);
        return res;
    }
    int res;
    void dfs(TreeNode root, int max){
        if(root==null) return;
        if(root.val>=max)res++;
        max = Math.max(max, root.val);
        // System.out.println(root.val);
        dfs(root.left, max);
         dfs(root.right, max);
    }
}