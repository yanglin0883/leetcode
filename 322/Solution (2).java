class Solution {
    public int coinChange(int[] coins, int amount) {
        return dfs(0, coins, amount);
    }
    int dfs(int start, int[]coins, int amount){
        if(amount==0) return 0;
        if(start>=coins.length || amount<0) return -1;
        int maxTime = amount/coins[start];
        int min = Integer.MAX_VALUE;
        for(int x=0;x<=maxTime;x++){
            if(amount>=x*coins[start]){
                int res=dfs(start+1, coins, amount-x*coins[start]);
                if(res!=-1) min = Math.min(min, res+x);
            }
        }
        return (min == Integer.MAX_VALUE)?-1:min;
    }
}