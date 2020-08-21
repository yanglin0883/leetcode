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
    public int maxDepth(TreeNode root) {
        return maxLR(root);
    }
    private int maxLR(TreeNode root){
        if(root==null) return 0;
        if(root.left == null)  return maxLR(root.right)+1;
        if(root.right == null) return maxLR(root.left)+1;
        return Math.max(maxLR(root.left), maxLR(root.right))+1;
    }
}