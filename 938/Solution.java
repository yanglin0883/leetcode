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
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum=0;
        if(root==null) return 0;
        if(root.val<L) sum += rangeSumBST(root.right,L,R);
        else if(root.val>R) sum += rangeSumBST(root.left,L,R);
        else{
            sum = root.val + rangeSumBST(root.left, L, root.val) + rangeSumBST(root.right, root.val,R);
        }
        return sum;
    }
}