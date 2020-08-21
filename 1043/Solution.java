class Solution {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int[] dp = new int[A.length+1];
        for(int i=1;i<=A.length;i++){
            int max = A[i-1];
            for(int j=i-1, k=1;j>=0&&k<=K;j--, k++){
                max = Math.max(max, A[j]);
                dp[i] = Math.max(dp[i], dp[j]+max*k);
            }
        }
        return dp[A.length];
    }
}