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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        dfs(root,0);
        return sum;
    }
    int sum=0;
    void dfs(TreeNode root, int lastLevel){
        lastLevel = lastLevel*10+root.val;
        //System.out.println(lastLevel+"  "+sum);
        if(root.left==null&&root.right==null){
            sum+=lastLevel;
        }
        else {
            if(root.left!=null) dfs(root.left, lastLevel);
            if(root.right!=null) dfs(root.right, lastLevel);
        }            
    }
}