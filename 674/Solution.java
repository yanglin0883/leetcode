class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int start=0, maxLen=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                maxLen = Math.max(maxLen, i-start);
                start = i;
            }
        }
        maxLen = Math.max(maxLen, nums.length-start);
        return maxLen;
    }
}