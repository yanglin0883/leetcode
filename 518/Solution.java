class Solution {
    public int change(int amount, int[] coins) {
        dfs(amount, coins, 0);
        return res;
    }
    int res=0;
    void dfs(int amount, int[]c, int cur){
        if(amount==0){
            res++;
            return;
        }
        if(amount<0) return;
        for(int i=cur;i<c.length;i++){
            dfs(amount-c[i], c, i);
        }
    }
}