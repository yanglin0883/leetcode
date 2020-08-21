class Solution {
    public int lengthOfLIS(int[] nums) {
        int memo[][] = new int[nums.length+1][nums.length];
        for(int[] l:memo)
            Arrays.fill(l, -1);
        return dfs(nums, -1, 0, memo);
    }
    public int dfs(int[]nums, int pre, int cur, int[][]memo){
        if(cur==nums.length) return 0;
        if(memo[pre+1][cur]>=0) return memo[pre+1][cur];
        
        int taken=0;
        if(pre<0 || nums[cur]>nums[pre])
            taken = 1+dfs(nums, cur, cur+1, memo);
        int nottaken = dfs(nums, pre, cur+1, memo);
        memo[pre+1][cur] = Math.max(taken, nottaken);
        return memo[pre+1][cur];
    }
}