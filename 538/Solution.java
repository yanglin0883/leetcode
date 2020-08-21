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
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return null;
        TreeNode temp= new TreeNode(0); 
        temp.right = convertBST(root.right);
        temp.val = sum+root.val;
        sum+=root.val;
        temp.left = convertBST(root.left);
        return temp;
    }
    int sum=0;
}