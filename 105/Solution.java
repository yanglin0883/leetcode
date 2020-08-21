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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||preorder.length==0) return null;
        TreeNode cur = new TreeNode(preorder[0]);
        int i=0;
        for(;i<inorder.length;i++){
            if(inorder[i]==preorder[0]) break;
        }
        int[]inLeft = Arrays.copyOfRange(inorder, 0, i);
        int[]inRight = Arrays.copyOfRange(inorder, i+1, inorder.length);
        int[]preLeft = Arrays.copyOfRange(preorder, 1, i+1);
        int[]preRight= Arrays.copyOfRange(preorder, i+1, preorder.length);
        cur.left = buildTree(preLeft, inLeft);
        cur.right = buildTree(preRight, inRight);
        return cur;
    }
}