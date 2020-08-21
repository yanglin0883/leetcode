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
    public int getMinimumDifference(TreeNode root) {
        int[] res = search(root);
        return res[0];
    }
    
    int[] search(TreeNode root){
        if(root.left==null&&root.right==null){
            int[] res = {Integer.MAX_VALUE, root.val, root.val};
            return res;
        }
        int[] res = new int[3];
        if(root.left==null){
            int[] right = search(root.right);
            res[0] = Math.min(right[0], right[1] - root.val);
            res[1] = root.val;
            res[2] = right[2];
            return res;
        }
        else if(root.right == null){
            int[] left = search(root.left);
            res[0] = Math.min(left[0], root.val - left[2]);
            res[1] = left[1];
            res[2] = root.val;
            return res;
        }                
        int[] left = search(root.left);
        int[] right= search(root.right);
        int min1 = Math.min(left[0], root.val - left[2]);
        int min2 = Math.min(right[0], right[1]-root.val);
        res[0] = Math.min(min1, min2);
        res[1] = left[1];
        res[2] = right[2];
        return res;
    }
}