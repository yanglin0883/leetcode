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
    public int findTilt(TreeNode root) {
        if(root==null) return 0;
        return findTilt(root.left) + tilt(root) + findTilt(root.right);
    }
    int tilt(TreeNode root){
        if(root ==null) return 0;
        return Math.abs(SumOfNode(root.left) - SumOfNode(root.right));
    }
    int SumOfNode(TreeNode root){
        if(root==null) return 0;
        return SumOfNode(root.left) + root.val + SumOfNode(root.right);
    }
}