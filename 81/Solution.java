class Solution {
    public boolean search(int[] nums, int target) {
        if(nums==null||nums.length==0) return false;
        int start=0, end=nums.length-1, mid=0;
        while(start<=end){
            mid = start+(end-start>>1);
            if(nums[mid]==target) return true;
            if(nums[start]<nums[mid]){
                if(nums[start]<=target&&target<nums[mid])end = mid-1;
                else start = mid+1;
            }
            else if(nums[start]>nums[mid]){
                if(nums[mid]<target&&target<=nums[end]) start = mid+1;
                else end = mid-1;
            }
            else start++;
        }
        return false;
    }
}