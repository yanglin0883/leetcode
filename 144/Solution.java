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
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }
    ArrayList<Integer> res = new ArrayList<Integer>();
    private void dfs(TreeNode root){
        if(root==null) return;
        res.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}