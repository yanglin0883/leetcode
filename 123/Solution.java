class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int[] dp1 = new int[prices.length];
        int[] dp2 = new int[prices.length];
        int min = prices[0];
        for(int i=1;i<dp1.length;i++){
            min = Math.min(min, prices[i]);
            dp1[i] = Math.max(dp1[i-1], prices[i]-min);
        }
        int max = prices[dp2.length-1];
        for(int i=dp2.length-2;i>-1;i--){
            max = Math.max(max, prices[i]);
            dp2[i] = Math.max(dp2[i+1], max-prices[i]);
        }
        int res=0;
        for(int i=0;i<dp1.length;i++){
            res = Math.max(res, dp1[i]+dp2[i]);
        }
        return res;
    }
}