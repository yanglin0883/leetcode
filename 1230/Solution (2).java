class Solution {
    public double probabilityOfHeads(double[] prob, int target) {
        if(target>prob.length) return 0.0;
        double[][] dp = new double[prob.length][target+1];
        dp[0][0] = 1-prob[0];
        if(target>0)dp[0][1] = prob[0];
        for(int i=1;i<prob.length;i++){
            dp[i][0] = dp[i-1][0]*(1-prob[i]);
        }
        for(int i=1;i<prob.length;i++){
            for(int j=1;j<=target;j++){
                dp[i][j]=prob[i]*dp[i-1][j-1]+(1-prob[i])*dp[i-1][j];
            }
        }
        return dp[prob.length-1][target];
    }
}