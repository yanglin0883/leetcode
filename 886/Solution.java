class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        g = new ArrayList[N];
        for(int[] d: dislikes){
            if(g[d[0]-1]==null)g[d[0]-1] = new ArrayList();
            g[d[0]-1].add(d[1]-1);
            if(g[d[1]-1]==null)g[d[1]-1] = new ArrayList();
            g[d[1]-1].add(d[0]-1);
        }
        colors = new int[N];
        for(int i=0;i<N;i++)
            if(colors[i]==0 && !dfs(i,1)) return false;
        return true;
    }
    ArrayList<Integer>[] g;
    int[] colors;
    boolean dfs(int cur, int color){
        colors[cur] = color;
        if(g[cur]!=null)for(int next:g[cur]){
            if(colors[next]==color) return false;
            if(colors[next]==0 && !dfs(next, -color)) return false;
            
        }
        return true;
    }
}