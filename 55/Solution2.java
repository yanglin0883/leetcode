class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        int dp[]=new int[nums.length];//dp ¶¯Ì¬¹æ»®
        dp[0] = 1;
        for(int i=0;i<dp.length;i++){
            for(int j=i+1;j<dp.length &&j<=nums[i]+i;j++){
                dp[j] += dp[i];
            }
        }
        
        // for(int i=0;i<dp.length;i++){
        //     System.out.println(dp[i]);
        // }
        if(dp[nums.length-1]==0) return false;
        return true;
    }
}