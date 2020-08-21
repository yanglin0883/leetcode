/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        Arrays.fill(t, true);
        dfs(root);
        return res;
    }
    boolean[] t = new boolean[10];
    int res=0;
    void dfs(TreeNode root){
        if(root==null) return ;
        t[root.val-1] = !t[root.val-1];
        if(root.left==null && root.right==null){
            if(test()) res++;
        }
        dfs(root.left);
        dfs(root.right);
        t[root.val-1] = !t[root.val-1];
    }
    boolean test(){
        int r=0;
        for(int i=0;i<10;i++)
        {
            if(!t[i]) r++;
        }
        return r<=1;
    }
}