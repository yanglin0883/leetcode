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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length);
    }
    TreeNode helper(int a[], int start, int end){
        if(start>=a.length||start>=end) return null;
        //System.out.println(start+"  "+end);
        TreeNode res = new TreeNode(a[start]);
        int right=start+1;
        while(right<a.length && a[right]<a[start])right++;
        res.left = helper(a, start+1, right);
        res.right = helper(a, right, end);
        return res;
    }
}