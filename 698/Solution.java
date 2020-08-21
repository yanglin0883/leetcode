class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int N = nums.length;
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int target = sum/k;
        if(sum%k>0 || nums[N-1]>target) return false;
        
        boolean dp[] = new boolean[1<<N];
        dp[0] = true;
        int[] total = new int[1<<N];
        
        for(int state=0;state<(1<<N);state++){
            if(!dp[state]) continue;
            for(int i=0;i<N;i++){
                int future = state | (1<<i);
                if(state != future && !dp[future]){
                    if(nums[i] <= target-(total[state]%target)){
                        dp[future] = true;
                        total[future] = total[state] + nums[i];
                    }else break;
                }
            }
        }
        return dp[(1<<N)-1];
    }
}