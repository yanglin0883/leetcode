class Solution {
    public int search(int[] nums, int target) {
        int start =0, end = nums.length;
        int mid = start+(end-start>>1);
        while(start<end){
            mid = start+(end-start>>1);
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) start = mid+1;
            else end = mid;
        }
        return -1;
    }
}