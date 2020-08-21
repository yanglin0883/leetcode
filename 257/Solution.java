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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return res;
        StringBuilder path=new StringBuilder();
        dfs(root, path);
        return res;
    }
    List<String> res= new ArrayList<String>();
    
    void dfs(TreeNode root, StringBuilder path){
        path.append(root.val);
        int n=root.val;
        int len=0;
        if(n<0){
            len++;
            n=-n;
        }
        while(n>0){
            n/=10;
            len++;
        }
        if(root.left==null&&root.right==null){
            res.add(new String(path));
            path.delete(path.length()-len, path.length());
        }
        else {
            path.append("->");
            if(root.left!=null) dfs(root.left, path);
            if(root.right!=null) dfs(root.right, path);
            path.delete(path.length()-len-2, path.length());
        }
    }
}