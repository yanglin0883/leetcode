class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        if(nums.length==1) return nums[0];
        int n = nums.length;
        int dp[] = new int[n];
        dp[n-1] = nums[n-1];
        for(int i=n-2;i>-1;i--){
            int max = Integer.MIN_VALUE;
            for(int j=1;j<=k && j+i<n;j++){
                max = Math.max(dp[j+i], max);
            }
            dp[i] = max>0?max+nums[i] : nums[i];
        }
        // System.out.println(Arrays.toString(dp));
        int max = dp[0];
        for(int i:dp)max = Math.max(max, i);
        return max;
    }
}