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
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        TreeNode dummy = new TreeNode(0);
        dummy.right = root;
        dfs(root, dummy, val);
        return dummy.right;
    }
    void dfs(TreeNode root, TreeNode parent, int val){
        if(root==null||val>root.val) {
            parent.right = new TreeNode(val);
            parent.right.left = root;
            return;
        }
        dfs(root.right, root,val);
    }
}