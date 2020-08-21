class Solution {
    public int findMin(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    int helper(int[] nums, int left, int right){
        if(left+1>=right) return Math.min(nums[left], nums[right]);
        if(nums[left]<nums[right]) return nums[left];
        int mid = left+(right-left>>1);
        return Math.min(helper(nums, left, mid), helper(nums, mid+1, right));
    }
}