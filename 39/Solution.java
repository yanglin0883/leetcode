class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if(candidates==null||candidates.length==0) return res;
        Arrays.sort(candidates);
        //int[] can = toUnique(candidates);
        // for(int i=0;i<can.length;i++)
        //     System.out.print(can[i]+"   ");
        // System.out.println();
        dfs(candidates, 0, new ArrayList<Integer>(), res, target);
        return res;
    }
    void dfs(int[]can, 
             int index, 
             List<Integer>current, 
             List<List<Integer>>res, 
             int target){
        if(target==0){
            res.add(new ArrayList<Integer>(current));
            return;
        }
        else if(target<0) return;
        for(int i=index;i<can.length;i++){
            if(can[i]>target)break;
            current.add(can[i]);
            dfs(can, i, current, res, target-can[i]);
            current.remove(current.size()-1);
        }
    }/*
    int[] toUnique(int[] a){
        Arrays.sort(a);
        int i=0, j=0;
        while(j<a.length){
            if(a[i]!=a[j])a[++i] = a[j];
            j++;
        }
        return Arrays.copyOfRange(a,0,i+1);
    }*/
}