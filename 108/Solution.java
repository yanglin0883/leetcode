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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }
    
    private TreeNode helper(int[] nums, int start, int end){
        if(start==end) return null;
        int mid = start + end >>1;
        TreeNode res = new TreeNode(nums[mid]);
        res.left = helper(nums, start, mid);
        res.right = helper(nums, mid+1, end);
        return res;
    }
}