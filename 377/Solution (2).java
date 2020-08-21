class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[]dp = new int[target+1];
        dp[0]=1;
        for(int i=0;i<dp.length;i++){
            for(int j:nums)
                if(i+j<=target)
                    dp[i+j] += dp[i];
            
        }
        return dp[target];
    }
}