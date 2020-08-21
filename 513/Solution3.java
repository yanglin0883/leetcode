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
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    int res=0;
    int maxL = -1;
    void dfs(TreeNode root, int curL){
        if(root==null) return;
        if(curL > maxL){
            res = root.val;
            maxL = curL;
        }
        dfs(root.left, curL+1);
        dfs(root.right, curL+1);
    }
}