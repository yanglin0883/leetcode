class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<1) return 0;
        int n = prices.length;
        int[][]dp = new int[n+1][4];
        dp[0][0] = dp[0][3] = 0;
        dp[0][1] = dp[0][2] = Integer.MIN_VALUE/2;
        for(int i=1;i<=n;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][3]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][2] = dp[i-1][0] -  prices[i-1];
            dp[i][3] = Math.max(dp[i-1][1], dp[i-1][2]) + prices[i-1];
        }
        int max = dp[n][0];
        for(int i=1;i<4;i++)
            max = Math.max(max, dp[n][i]);
        return max;
    }
}