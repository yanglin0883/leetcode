class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0 ;
        if(coins==null||coins.length==0) return -1;
        Arrays.sort(coins);
        dfs(coins, coins.length-1, 0, amount);
        if(res==Integer.MAX_VALUE) return -1;
        else return res;
    }
    int res=Integer.MAX_VALUE;
    void dfs(int[]coins, int start, int steps, int target){
        if(target==0){
            res=Math.min(steps,res);
            return;
        }
        if(target<0) return;
        System.out.println(start+" "+steps+"  "+target);
        for(int i=start;i>-1;i--){
            if(coins[i]>target)continue;
            dfs(coins, i, steps+1, target-coins[i]);
        }
    }
}