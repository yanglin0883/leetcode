class Solution {
    public int[] countBits(int num) {
        int dp[] = new int[num+1];
        dp[0] = 0;
        int _1000 = 0;
        for(int i=1;i<=num;i++){
            if((i & (i-1))==0){
                _1000 = i;
                dp[i]=1;
            }
            else{
                dp[i] = 1+dp[i-_1000];
            }
        }
        return dp;
    }
}