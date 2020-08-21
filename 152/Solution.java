class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            int cur = nums[i];
            if(cur>0){
                dp[i][0] = Math.max(cur, cur*dp[i-1][0]);
                dp[i][1] = Math.min(cur, cur*dp[i-1][1]);
            }
            else {
                dp[i][0] = Math.max(cur, cur*dp[i-1][1]);
                dp[i][1] = Math.min(cur, cur*dp[i-1][0]);
            }
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}