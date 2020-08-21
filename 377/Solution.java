class Solution {
    public int combinationSum4(int[] nums, int target) {
        if(nums==null||nums.length==0) return 0;
        Arrays.sort(nums);
        int[] res = new int[1];
        dfs( nums, target, res);
        return res[0];
    }
    void dfs(int[]nums, int target, int[] res){
        if(target==0) res[0]++;
        if(target<=0) return;
        //System.out.println(index+"  "+target);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>target) break;
            dfs( nums, target-nums[i], res);
        }
    }
}