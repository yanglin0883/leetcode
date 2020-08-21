class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n<1||k<1) return res;
        dfs(0,n,k,new ArrayList<Integer>(), res);
        return res;
    }
    void dfs(int cur, int n, int k, ArrayList<Integer> current, List<List<Integer>>res){
        if(k==0){
            res.add(new ArrayList<Integer>(current));
            return;
        }
        for(int i=cur+1;i<=n;i++){
            if(current.contains(i))continue;
            current.add(i);
            dfs(i,n, k-1, current, res);
            current.remove(current.size()-1);
        }
    }
}