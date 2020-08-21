class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums) sum+=i;
        if(sum%2==1) return false;
        sum/=2;
        Arrays.sort(nums);
        dfs(nums, 0, sum);
        return res;
    }
    boolean res=false;
    void dfs(int[]nums, int index, int target){
        if(res) return;
        if(0 == target){
            res = true;
            return;
        }
        //System.out.println(index+"  "+target);
        if(target<0) return;
        for(int i=index;i<nums.length;i++){
            if(i!=index&&nums[i]==nums[i-1])continue;
            if(nums[i]>target) break;
            dfs(nums, i+1, target-nums[i]);
        }
    }
}