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
    public int findSecondMinimumValue(TreeNode root) {
        Arrays.fill(min, Long.MAX_VALUE);
        dfs(root);
        if(min[1] == Long.MAX_VALUE) return -1;
        return (int)min[1];
    }
    long[] min = new long[2];
    
    private void dfs(TreeNode root){
        if(root==null) return;
        if(root.val<min[0]){
            min[1] = min[0];
            min[0] = root.val;
        }else if(root.val<min[1] &&root.val!=min[0]){
            min[1] = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}