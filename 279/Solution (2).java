class Solution {
    public int numSquares(int n) {
        int index = (int)Math.sqrt(n)+1;
        int[] square = new int[index];
        int[] dp = new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i] = i;
        }
        for(int i=1;i<index;i++){
            square[i] = i*i;
            dp[i*i] = 1;
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<index && square[j]<=i;j++){
                if(dp[i]>dp[i-square[j]]+1)
                    dp[i] = dp[i-square[j]]+1;
            }
        }
        return dp[n];
        //System.out.println(square);
    }
    
}