class Solution {
    public int countOrders(int n) {
        if(n==1) return 1;
        long[] dp = new long[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            int temp =i*((i-1)*2+1);
            System.out.println(temp);
            dp[i] = dp[i-1]*temp%1000000007;
        }
        return (int)dp[n];
    }
}