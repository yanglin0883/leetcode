class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null||nums.length==0) return -1;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[nums.length-2]<nums[nums.length-1]) return nums.length-1;
        int left=1, right = nums.length-2, mid=0;
        while(left+1<right){
            mid = left+(right-left>>1);
            if(nums[mid]<nums[mid-1]) right =mid;
            else if(nums[mid]<nums[mid+1]) left = mid;
            else right = mid;
        }
        if(nums[right]>nums[left]) return right;
        else return left;
    }
}