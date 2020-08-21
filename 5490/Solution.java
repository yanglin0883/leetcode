class Solution {
    public int minDays(int n) {
        return dfs(n);
    }
    Map<Integer, Integer> hm = new HashMap();
    int dfs(int n){
        int res =Integer.MAX_VALUE;
        if(n==1) res =1;
        else{
            if(hm.containsKey(n)) return hm.get(n);
            if(n%3==0)res = Math.min(res, dfs(n/3));
            if(n%2==0)res = Math.min(res, dfs(n/2));
            res = Math.min(res, dfs(n-1));
            res++;
        }
        hm.put(n, res);
        // System.out.println(n+" + "+ res);
        return res;
    }
}