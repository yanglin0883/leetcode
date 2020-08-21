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
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    int res=0;
    void dfs(TreeNode root, int lastLevel){
        if(root ==null) return;
        lastLevel = (lastLevel<<1)+root.val;
        if(root.left == null&& root.right == null) res+= lastLevel;
        dfs(root.left, lastLevel);
        dfs(root.right, lastLevel);
    }
}