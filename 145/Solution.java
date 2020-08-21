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
    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return res;
    }
    List<Integer> res = new ArrayList<Integer>();
    private void dfs(TreeNode root){
        if(root == null) return;
        dfs(root.left);
        dfs(root.right);
        res.add(root.val);
    }
}