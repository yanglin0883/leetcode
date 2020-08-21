class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] g = new int[n][n];
        for(int[] i: flights){
            g[i[0]][i[1]] = i[2];
        }
        dfs(g, src, dst, K, 0);
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
    int min = Integer.MAX_VALUE;
    void dfs(int[][]g, int cur, int dst, int K, int sum){
        if(cur==dst){
            min =  Math.min(min, sum);
            // System.out.println(sum);
            return;
        }
        if(K==-1) return;
        K--;
        for(int i=0;i<g[cur].length;i++){
            if(g[cur][i]!=0){
                // System.out.println(i);
                dfs(g, i, dst, K, sum+g[cur][i]);
            }
        }
    }
}
//time limit