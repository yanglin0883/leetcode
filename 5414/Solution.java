class Solution {
    public List<Integer> peopleIndexes(List<List<String>> f1) {
        List<Integer> res = new ArrayList();
        boolean[] v = new boolean[f1.size()];
        List<Set<String>> f = new ArrayList();
        for(List<String> i: f1)f.add(new HashSet(i));
        for(int i=0;i<f.size();i++){
            for(int j=0;j<f.size();j++){
                if(i==j || v[j])continue;
                if(isSub(f.get(i), f.get(j))){
                    v[i] = true;
                    break;
                }
            }
        }
        for(int i=0;i<v.length;i++)
            if(!v[i])res.add(i);
        return res;
    }
    
    boolean isSub(Set<String> a, Set<String>b){
        for(String s:a){
            if(!b.contains(s)) return false;
        }
        return true;
    }
}