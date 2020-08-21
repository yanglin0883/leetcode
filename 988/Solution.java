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
    public String smallestFromLeaf(TreeNode root) {
        if(root==null) return "";
        dfs(root,"");
        return res;
    }
    String res="";
    
    void dfs(TreeNode root, String path){
        path = (char)(root.val+'a') + path;
        if(root.left==null&&root.right==null){
            if(res=="" || res.compareTo(path)>0) res = path;
        }
        else{
            if(root.left!=null) dfs(root.left, path);
            if(root.right!=null) dfs(root.right, path);
        }
    }
}