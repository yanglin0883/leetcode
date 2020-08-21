class Solution {
    public boolean winnerSquareGame(int n) {
        for(int i=1;i*i<=n;i++){
            square.add(i*i);
        }
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n);
    }
    int[] dp ;
    List<Integer> square = new ArrayList();
    boolean helper(int n){
        if(dp[n]!=-1)return dp[n]==1;
        if(square.contains(n)) {dp[n] = 1; return true;}
        for(int i=0;i<square.size() && square.get(i)<n;i++){
            int temp = n-square.get(i);
            boolean r = helper(temp);
            if(!r) {dp[n] = 1; return true;}
        }
        {dp[n] = 0; return false;}
    }
}