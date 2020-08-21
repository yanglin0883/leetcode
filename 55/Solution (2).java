class Solution {
    public boolean canJump(int[] nums) {
        if(nums==null||nums.length<2) return true;
        int[]dp = new int[nums.length];
        dp[dp.length-1] = dp.length-1;
        for(int i=dp.length-2;i>-1;i--){
            for(int j=i;j<dp.length &&j<=i+nums[i];j++){
                dp[i] = Math.max(dp[i], dp[j]);
                // System.out.println(i+"  "+j);
            }
        }
        // System.out.println(Arrays.toString(dp));
        return dp[0]==dp.length-1;
    }
}