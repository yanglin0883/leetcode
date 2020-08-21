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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null) return null;
        if(t1==null) return deepCopy(t2);
        if(t2==null) return deepCopy(t1);
        TreeNode res = new TreeNode(t1.val+t2.val);
        res.left = mergeTrees(t1.left, t2.left);
        res.right = mergeTrees(t1.right, t2.right);
        return res;
    }
    
    private TreeNode deepCopy(TreeNode node){
        if(node==null) return null;
        TreeNode res = new TreeNode(node.val);
        if(node.left!=null) res.left = deepCopy(node.left);
        if(node.right!=null) res.right = deepCopy(node.right);
        return res;
    }
}