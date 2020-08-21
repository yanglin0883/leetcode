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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return checkNodes(root.left, root.right);
    }
    
    private boolean checkNodes(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        if(n1.val != n2.val) return false;
        return checkNodes(n1.left, n2.right)&&checkNodes(n2.left, n1.right);
    }
}