class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0) return 0;
        int dp[] = new int[nums.length]; //the max sub ending with this point
        dp[0] = nums[0];
        int max=dp[0];        
        for(int i=1;i<nums.length;i++){
            dp[i] = (dp[i-1]>0)? dp[i-1]+nums[i] : nums[i];
            if(dp[i]>max) max = dp[i];
        }
        return max;
    }
}