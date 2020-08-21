class Solution {
    public int numOfArrays(int n, int m, int k) {
        int[][][] dp = new int[52][101][52];
        int mod = 1000000007;
        dp[0][0][0] = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=m;j++){
                for(int l=0;l<=n;l++){
                    for(int ii=1;ii<=m;ii++){
                        if(ii<=j){
                            dp[i+1][j][l] += dp[i][j][l];
                            if(dp[i+1][j][l]>=mod) dp[i+1][j][l]-=mod;
                        }
                        else{
                            dp[i+1][ii][l+1] += dp[i][j][l];
                            if(dp[i+1][ii][l+1]>=mod) dp[i+1][ii][l+1]-=mod;   
                        }
                    }
                }
            }
        }
        int ans=0;
        for(int i=0;i<=m;i++){
            ans += dp[n][i][k];
            if(ans>mod)ans-=mod;
        }
        return ans;
    }
}