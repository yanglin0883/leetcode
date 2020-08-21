class Solution {
    public int[] beautifulArray(int N) {
        return f(N);
    }
    Map<Integer, int[]>memo = new HashMap();
    int[] f(int N){
        if(memo.containsKey(N)) return memo.get(N);
        int[] ans = new int[N];
        if(N==1){
            ans[0] = 1;
        }else{
            int t=0;
            for(int x: f((N+1)/2))
                ans[t++] = 2*x-1;
            for(int x: f(N/2))
                ans[t++] = 2*x;
        }
        memo.put(N, ans);
        return ans;
    }
}