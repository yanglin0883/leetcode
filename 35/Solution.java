class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0||target<nums[0]) return 0;
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)>>1;
        while(left<right){
            //System.out.println(left+"  "+mid+"  "+right);
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left = mid+1;
            if(nums[mid]>target) right = mid-1;
            mid = (left+right)>>1;
        }
        return target<=nums[mid]?mid:mid+1;
    }
}