class Solution {
    public int maxCoins(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int n = nums.length;
        int[][]dp = new int[n+2][n+2];
        int[]list = new int[n+2];
        list[0]=1;
        list[n+1]=1;
        for(int i=0;i<n;i++)
            list[i+1] = nums[i];
        for(int size=1;size<=n;size++){
            for(int left=1;left<=n-size+1;left++){
                int right = left+size-1;
                for(int k=left;k<=right;k++){
                    int coins=dp[left][k-1]+dp[k+1][right]+list[left-1]*list[k]*list[right+1];
                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
        }
        return dp[1][n];
    }
}