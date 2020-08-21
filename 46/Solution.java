class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, new ArrayList<Integer>(), res);
        return res;
    }
    private void dfs(int[]nums, List<Integer> path, List<List<Integer>>res){
        if(nums.length==path.size()){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            dfs(nums, path, res);
            path.remove(path.size()-1);
        }
    }
}