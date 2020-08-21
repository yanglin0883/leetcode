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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        dfs(root, x);
        System.out.println(left+"  "+right);
        return (n-left-right-1>left+right+1)||(left>n-left)||(right>n-right);
    }
    int left=0, right=0;
    boolean caught = false;
    void dfs(TreeNode root, int x){
        if(root==null||caught) return;
        if(root.val==x){
            left = count(root.left);
            right = count(root.right);
            caught=true;
            return;
        }
        dfs(root.left, x);
        dfs(root.right, x);
    }
    int count(TreeNode root){
        if(root==null) return 0;
        return 1+count(root.left)+count(root.right);
    }
}