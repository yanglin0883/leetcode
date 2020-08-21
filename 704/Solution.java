class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length, target);
    }
    private int binarySearch(int[] nums, int start, int end, int target){
        if(start==end) return -1;
        int mid = start+(end-start >>1);
        if(nums[mid] == target) return mid;
        else if(nums[mid] <target) return binarySearch(nums, mid+1, end, target);
        else return binarySearch(nums, start, mid, target);
    }
}