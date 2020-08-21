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
    public boolean isValidBST(TreeNode root) {
        dfs(root);
        return flag;
    }
    boolean flag=true;
    long temp = (long)Integer.MIN_VALUE-1; // ע������ǿ������ת���� ��������
    void dfs(TreeNode root){
        if(root==null) return;
        if(!flag) return;
        dfs(root.left);
        if(temp>=root.val){
            flag = false;
            return;
        }
        temp = root.val;
        dfs(root.right);
    }
}