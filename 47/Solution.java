class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null||nums.length==0) return res;
        Arrays.sort(nums);
        dfs(res, nums, new boolean[nums.length], new ArrayList<Integer>());
        return res;
    }
    void dfs(List<List<Integer>>res, int[]nums, boolean[]visited,  ArrayList<Integer>path){
        if(path.size()==nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]||(i!=0&&nums[i] == nums[i-1]&&visited[i-1]))continue;
            path.add(nums[i]);
            visited[i] = true;
            dfs(res, nums, visited, path);
            visited[i] = false;
            path.remove(path.size()-1);
        }
    }
}