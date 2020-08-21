class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<1||n>45) return res;
        dfs(1, k, n, new ArrayList<Integer>(), res);
        return res;
    }
    void dfs(int cur, 
             int k, 
             int target, 
             ArrayList<Integer> current, 
             List<List<Integer>>res){
        if(k==0&&target==0) res.add(new ArrayList<Integer>(current));
        if(k<=0||target<=0) return;
        for(int i=cur;i<10;i++){
            current.add(i);
            dfs(i+1, k-1, target-i, current, res);
            current.remove(current.size()-1);
        }
    }
}