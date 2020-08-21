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
    public TreeNode bstToGst(TreeNode root) {
        getSum(root);
        modifyTree(root);
        return root;
    }
    int sum=0;
    void getSum(TreeNode root){
        if(root==null) return;
        sum+=root.val;
        getSum(root.left);
        getSum(root.right);
    }
    void modifyTree(TreeNode root){
        if(root==null) return;
        modifyTree(root.left);        
        int pre=root.val;
        root.val = sum;
        sum -= pre;
        modifyTree(root.right);
    }
}