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
    public boolean findTarget(TreeNode root, int k) {
        tree = root;
        dfs(root, k);
        return res;
    }
    boolean res = false;
    TreeNode tree;
    void dfs(TreeNode root, int k){
        if(res || root==null)return;
        search(tree,k-root.val,root);
        dfs(root.left, k);
        dfs(root.right, k);
    }
    void search(TreeNode root, int k, TreeNode temp){
        if(res||root == null) return;
        if(root.val==k){
            if(root==temp){
                search(root.left,k,temp);
                search(root.right, k, temp);
            }
            else res = true;
            return;
        }
        else if(root.val<k)
            search(root.right, k, temp);
        else search(root.left, k, temp);
    }
}