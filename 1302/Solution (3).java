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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        dfs(root, 1);
        return sum;
    }
    int sum=0, maxDep;
    void dfs(TreeNode root, int depth){
        if(root==null) return;
        if(depth>maxDep){
            maxDep = depth;
            sum=root.val;
        }
        else if(depth==maxDep){
            sum+=root.val;
        }
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}