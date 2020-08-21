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
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, new StringBuilder());
        return res;
    }
    List<String> res = new ArrayList();
    void dfs(TreeNode root, StringBuilder path){
        if(root==null) return;
            path.append(root.val);
        if(root.left==null&&root.right==null){
            res.add(path.toString());
        }else{
            path.append("->");
        }
        dfs(root.left, path);
        dfs(root.right, path);
        path.deleteCharAt(path.length()-1);
        for(int i=path.length()-1;i>0&&path.charAt(i)!='>';i--)
            path.deleteCharAt(i);
    }
}