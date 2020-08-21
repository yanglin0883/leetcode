class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        ArrayList<Integer>[] g = new ArrayList[N+1];
        for(int i=1;i<=N;i++)
            g[i] = new ArrayList();
        for(int[] d:dislikes){
            g[d[0]].add(d[1]);
            g[d[1]].add(d[0]);
        }
        Queue<Integer>q = new LinkedList();
        int[] colors =  new int[N+1];
        for(int i=1;i<=N;i++){
            if(colors[i]!=0)continue;
            q.offer(i);
            colors[i] = 1;
            while(!q.isEmpty()){
                int cur = q.poll();
                for(int next: g[cur]){
                    if(colors[next] == colors[cur]) return false;
                    if(colors[next] != 0)continue;
                    colors[next] = -colors[cur];
                    q.offer(next);
                }
            }
        }
        return true;
    }
}