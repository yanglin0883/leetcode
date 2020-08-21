class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int left=0, right=nums.length-1, mid=0;
        while(left<right){
            mid = left+(right-left>>1);
            if(nums[mid]>nums[right]) left = mid+1;
            else right = mid;
        }
        return nums[left];
    }
}