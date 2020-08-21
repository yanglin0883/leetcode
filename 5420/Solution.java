class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        for(int i=0;i<res.length;i++){
            int d=0;
            for(int j=i+1;j<res.length;j++){
                if(prices[j]<=prices[i]){
                    d = prices[j];
                    break;
                }
            }
            res[i] = prices[i] -d;
        }
        return res;
    }
}