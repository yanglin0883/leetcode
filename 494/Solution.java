class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums==null||nums.length==0) return 0;
        target = S;
        dfs(nums, 0, 0);
        return res;
    }
    int res=0, target;
    
    void dfs(int nums[], int index, int sum){
        if(index==nums.length){
            if(sum==target) 
                res++;
            return;
        }
        dfs(nums, index+1, sum+nums[index]);
        dfs(nums, index+1, sum-nums[index]);
    }
}