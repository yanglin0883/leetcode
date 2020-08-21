class Solution {
    public int numberWays(List<List<Integer>> hats) {
        int n = hats.size();
        boolean[][] cw = new boolean[n][41];
        for (int i = 0; i < n; ++i) {
            for (int h : hats.get(i))
                cw[i][h] = true;
        }
        int[][] dp = new int[41][1<<n];
        dp[0][0] = 1;
        for (int i = 1; i <= 40; ++i) {
            for (int j = 0; j < (1<<n); ++j) {
                dp[i][j] = dp[i-1][j];
            }
            for (int j = 0; j < (1<<n); ++j) {
                for (int k = 0; k < n; ++k) {
                    int j2 = j|(1<<k);
                    if (j2==j)
                        continue;
                    if (!cw[k][i])
                        continue;
                    dp[i][j2] += dp[i-1][j];
                    dp[i][j2] %= 1000000007;
                }
            }
        }
        return dp[40][(1<<n)-1];
    }
}
