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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        search(root, val);
        return root;
    }
    
    void search(TreeNode root, int val){
        if(root.val>val) {
            if(root.left==null) root.left = new TreeNode(val);
            else search(root.left, val);
        }
        else if(root.val<val) {
            if(root.right==null) root.right = new TreeNode(val);
            else search(root.right, val);
        }
    }
}