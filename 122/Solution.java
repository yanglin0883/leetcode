class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int minPrice=Integer.MAX_VALUE;
        boolean flag = false;
        for(int i=0;i<prices.length;i++){
            int j;
            for(j=i+1;j<prices.length;j++)
                if(prices[j]<prices[j-1]){
                    
                    break;
                }   
            sum += (j-1>i)? prices[j-1] -prices[i]:0;
           // System.out.println(sum+"  "+i+"  "+j);
            i=j-1;
        }
        return sum;
    }
}