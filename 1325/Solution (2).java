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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;
        this.target = target;
        boolean res = dfs(root);
        if(res) return null;
        return root;
    }
    int target;
    boolean dfs(TreeNode root){
        // 1st boolean is for this subtree contains no numbers but target;
        boolean res = false;
        if(root==null){
            res = true;
            return res;
        }
        boolean left = dfs(root.left);
        boolean right = dfs(root.right);
        if(left) root.left=null;
        if(right) root.right=null;
        //res[1] = (root.left==null&&root.right==null);
        res = left &&right &&(root.val==target);
        return res;
    }
}