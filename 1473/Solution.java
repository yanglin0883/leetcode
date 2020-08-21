class Solution {
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int inf = Integer.MAX_VALUE/2;
        int[][][] dp = new int[target+1][m+1][n+1];
        for(int i=0;i<=target;i++)
            for(int j=0;j<=m;j++)
                Arrays.fill(dp[i][j], inf);
        Arrays.fill(dp[0][0], 0);
        
        
        for(int k=1;k <= target;++k){
            for(int i=k;i<=m;++i){
                int hi=houses[i-1];
                int hj = i>=2 ? houses[i-2] : 0;
                int[] limiti = {hi, hi};
                if(hi==0){limiti[0] = 1;limiti[1] = n;   }             
                int[] limitj = {hj, hj};
                if(hj==0){limitj[0] = 1;limitj[1] = n;   } 
                for(int ci = limiti[0];ci<=limiti[1];++ci){
                    int v = ci==hi? 0 : cost[i-1][ci-1];
                    for(int cj = limitj[0];cj<=limitj[1];++cj){
                        int kk = k-((ci!=cj)?1:0) ;
                        dp[k][i][ci] = Math.min(dp[k][i][ci], dp[kk][i-1][cj]+v);
                    }
                }
            }
        }
        int min=inf;
        for(int i=0;i<=n;i++){
            min = Math.min(dp[target][m][i], min);
        }
        
        // for(int[][]i:dp)
        //     for(int[] j:i)
        //         System.out.println(Arrays.toString(j));
        return min>=inf? -1 : min;
    }
}