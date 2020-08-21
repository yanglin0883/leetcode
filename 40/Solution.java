class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        if(candidates==null||candidates.length<1) return res;
        Arrays.sort(candidates);
        dfs(candidates, 0, new ArrayList<Integer>(), res, target);
        return res;
    }
    private void dfs(int[] can, 
                     int index, 
                     ArrayList<Integer>current, 
                     List<List<Integer>>res, 
                     int target){
        if(target==0){
            res.add(new ArrayList<Integer>(current));
        }
        if(target<=0) return;
        for(int i=index;i<can.length;i++){
            if(can[i]>target) break;
            if(i>index&&can[i]==can[i-1])continue;
            current.add(can[i]);
            dfs(can, i+1, current, res, target-can[i]);
            current.remove(current.size()-1);
        }
    }
}