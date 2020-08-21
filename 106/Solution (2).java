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
        id = inorder;
        pd = postorder;
        return build(0, inorder.length, 0, postorder.length);
    }
    int[] id, pd;
    TreeNode build(int ins, int ine, int pos, int poe){
        if(ins==ine||pos==poe) return null;
        TreeNode res = new TreeNode(pd[poe-1]);
        int mid=0;
        for(;mid+ins<ine;mid++)
            if(id[mid+ins]==res.val) break;
        res.left = build(ins, ins+mid, pos, pos+mid);
        res.right = build(ins+mid+1, ine, pos+mid, poe-1);
        return res;
    }
}