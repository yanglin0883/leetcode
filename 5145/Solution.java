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
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);
        return res;
    }
    int res=0;
    void dfs(TreeNode root){
        if(root==null) return ;
        if(root.val%2==0)res+=sumOfGrandchildren(root);
        dfs(root.left);
        dfs(root.right);
    }
    
    int sumOfGrandchildren(TreeNode root){
        if(root==null) return 0;
        int sum=0;
        if(root.left!=null){
            if(root.left.left!=null) sum+=root.left.left.val;
            if(root.left.right!=null) sum+=root.left.right.val;
        }
        if(root.right!=null){
            if(root.right.left!=null) sum+=root.right.left.val;
            if(root.right.right!=null) sum+=root.right.right.val;
        }
        return sum;
    }
}