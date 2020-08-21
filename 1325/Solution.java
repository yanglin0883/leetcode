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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;

        while(flag){
            flag = false;
            deleteLeaf(root, target);
        }
        if(root.left==null&&root.right==null&&root.val == target) return null;
        return root;
    }
    boolean flag = true;
    void deleteLeaf(TreeNode root, int target){
        if(root.left!=null){
            deleteLeaf(root.left, target);
            if(root.left!=null&&root.left.left==null&&root.left.right==null&&root.left.val==target){
                root.left=null;
                flag = true;
            }
        }
        if(root.right!=null){
            deleteLeaf(root.right, target);
            if(root.right.left==null&&root.right.right==null&&root.right.val==target){
                root.right=null;
                flag = true;
            }
        }
    }
}