class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        int n = nums.length;
        int dp[] = new int[n];
        dp[n-1] = nums[n-1];
        int max = n-1;
        for(int i=n-2;i>-1;i--){
            if(dp[i+1]>dp[max]) max = i+1;
            else {
                if(i+k<max){
                    max = i+1;
                    for(int j=2;j<=k && i+j<n;j++)
                        if(dp[i+j]>dp[max]) max = i+j;
                }
            }
            dp[i] = dp[max]>0?dp[max]+nums[i] : nums[i];
        }
        // System.out.println(Arrays.toString(dp));
        int ma = dp[0];
        for(int i:dp)ma = Math.max(ma, i);
        return ma;
    }
}