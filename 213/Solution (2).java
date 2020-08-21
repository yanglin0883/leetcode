class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);
        
        return Math.max(helper(nums, 0, nums.length-1),helper(nums, 1, nums.length));
    }
    
    int helper(int[]nums, int start, int end){
        int dp[] = new int[nums.length];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start], nums[start+1]);
        for(int i=2;i<end;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        return Math.max(dp[end-1], dp[end-2]);
    }
}