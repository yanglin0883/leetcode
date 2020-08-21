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
    
    class Res{
        boolean flag=true;
        int depth;
        Res(){}
        Res(boolean flag, int depth){
            this.flag = flag;
            this.depth = depth;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        return helper(root).flag;
    }
    
    private Res helper(TreeNode root){
        if(root==null) return new Res(true, 0);
        Res left = helper(root.left);
        Res right = helper(root.right);
        if(Math.abs(left.depth-right.depth)>1) left.flag = false;
        return new Res(left.flag&&right.flag, 1+Math.max(left.depth, right.depth));
    }
}