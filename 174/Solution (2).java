class Solution {
    public int calculateMinimumHP(int[][] d) {
        int m = d.length, n = d[0].length;
        if(m==0 || n==0) return 0;
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = Math.min(d[m-1][n-1],0);
        for(int i=m-2;i>=0;i--){
            dp[i][n-1] = Math.min(dp[i+1][n-1] + d[i][n-1],0);
        }
        for(int i=n-2;i>=0;i--){
            dp[m-1][i] = Math.min(dp[m-1][i+1] + d[m-1][i],0);
        }
        for(int i=m-2;i>=0;i--)
            for(int j=n-2;j>=0;j--){
                dp[i][j] = Math.min(d[i][j] + Math.max(dp[i+1][j], dp[i][j+1]),0);
            }
        // for(int[] i:dp)System.out.println(Arrays.toString(i));
        return 1-dp[0][0];
    }
}