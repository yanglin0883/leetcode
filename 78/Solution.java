class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0, new ArrayList<Integer>());
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    void dfs(int[] nums, int index, ArrayList<Integer> path){
        if(index==nums.length){
            res.add(new ArrayList<Integer>(path));
            return;
        }
        //System.out.println(index);
        dfs(nums, index+1, path);
        path.add(nums[index]);
        dfs(nums, index+1, path);
        path.remove(path.size()-1);
    }
}