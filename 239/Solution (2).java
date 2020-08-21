class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k>nums.length) return null;
        int max=0;
        int i=0;
        for(;i<k;i++)
            if(nums[i]>=nums[max])max = i;
        int[] res = new int[nums.length-k+1];
        int index=0;
        res[index++] = nums[max];
        for(;i<nums.length;i++){
            if(max<=i-k){
                max=i;
                for(int j=i-1;j>i-k;j--)
                    if(nums[j]>nums[max]) max = j;
            }
            else if(nums[i]>=nums[max])max = i;
            res[index++] = nums[max];
        }
        return res;
    }
}