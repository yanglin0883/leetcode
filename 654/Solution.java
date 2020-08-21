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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null||nums.length==0) return null;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[max]) max = i;
        }
        TreeNode res = new TreeNode(nums[max]);
        res.left = constructMaximumBinaryTree(Arrays.copyOf(nums, max)) ;
        res.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, max+1, nums.length));
        return res;
    }
}