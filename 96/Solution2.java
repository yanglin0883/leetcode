class Solution {
    public int numTrees(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        dp=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
        dp[1]=1;
        helper(n);
        return dp[n];
    }
    int[]dp;
    private void helper(int n){
        int total = 0;
        for(int i=1;i<=n;i++){
            if(dp[i-1]==-1) helper(i-1);
            if(dp[n-i]==-1) helper(n-i);
            if(dp[i-1]==0) total += dp[n-i];
            else if(dp[n-i]==0) total+=dp[i-1];
            else  total += dp[i-1] * dp[n-i];
        }
        //System.out.println(n+" "+total);
        dp[n] = total;
    }
}