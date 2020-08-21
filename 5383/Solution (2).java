class Solution {
    public int numOfWays(int n) {
        long[][]dp = new long[n+1][2];
        dp[1][0] = 6;
        dp[1][1] =6;
        for(int i=2;i<dp.length;i++){
            dp[i][0] = 2*dp[i-1][1]%1000000007+3*dp[i-1][0]%1000000007;
            dp[i][1] = 2*dp[i-1][1]%1000000007+2*dp[i-1][0]%1000000007;
        }
        return (int)(((int)(dp[n][0]%1000000007)+dp[n][1]%1000000007)%1000000007);
    }
}