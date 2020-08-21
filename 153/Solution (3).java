class Solution {
    public int findMin(int[] nums) {
        if(nums==null||nums.length==0) return -1;
        if(nums.length==1) return nums[0];
        if(nums[0]<nums[nums.length-1]) return nums[0];
        int left=0, right = nums.length-1, mid=0;
        while(left<right){
            mid = left+(right-left>>1);
            // System.out.println(left+"  "+mid+"   "+right);
            if(nums[mid]>nums[mid+1]) return nums[mid+1];
            if(nums[mid-1]>nums[mid]) return nums[mid];
            else if(nums[mid]>nums[0])left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
}