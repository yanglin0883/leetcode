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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||inorder.length==0) return null;
        int len = inorder.length;
        int cur = postorder[len-1];
        TreeNode res = new TreeNode(cur);
        int mid = 0;
        for(int i=0;i<len;i++){
            if(inorder[i]==cur) {mid=i;break;}
        }
        //System.out.println(mid);
        int[]inorderLeft = Arrays.copyOfRange(inorder, 0, mid);
        int[]postorderLeft = Arrays.copyOfRange(postorder, 0, mid);
        res.left = buildTree(inorderLeft, postorderLeft);
        int[]inorderRight = Arrays.copyOfRange(inorder, mid+1, len);
        int[]postorderRight = Arrays.copyOfRange(postorder, mid, len-1);
        res.right = buildTree(inorderRight, postorderRight);
        return res;
    }
}