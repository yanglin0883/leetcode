class Solution {
    public boolean hasAllCodes(String s, int k) {
        List<String> kSet = get(k);
        for(String i: kSet ){
            if(!s.contains(i)) return false;
        }
        return true;
    }
    List<String> get(int k){
        List<String> res = new ArrayList();
        dfs(res, k, new StringBuilder());
        return res;
    }
    void dfs(List<String> res, int k, StringBuilder sb){
        if(k==0) {
            res.add(sb.toString());
            return;
        }
        for(int i=0;i<2;i++){
            sb.append(i);
            dfs(res, k-1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}