class Solution {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        if(n==1) return 1;
        if(t==0&&target==1)return 1;
        ArrayList<Integer> child[] = new ArrayList[n+1];
        for(int i=1;i<=n;i++) child[i] = new ArrayList<Integer>();
        for(int[] i : edges){
            child[i[0]].add(i[1]);
            child[i[1]].add(i[0]);
        }
        Queue<Integer> bfs = new LinkedList();
        Set<Integer> visited = new HashSet();
        bfs.offer(1);
        visited.add(1);
        double[] p=new double[n+1];
        p[1]=1;
        for(int i=0;i<=t&&!bfs.isEmpty();i++){
            int size = bfs.size();
            for(int j=0;j<size;j++){
                Integer cur = bfs.poll();
                int temp = child[cur].size();
                for(Integer k:child[cur])
                    if(visited.contains(k))temp--;
                if(cur==target)if(temp==0||i==t) return p[cur];
                // System.out.println(temp+"  "+p[cur]+" "+cur);
                for(Integer k:child[cur]){
                    if(visited.contains(k))continue;
                    p[k] = p[cur]/temp;
                    // if(k==target) return p[k];
                    bfs.offer(k);
                    visited.add(k);
                }
            }
        }
        return 0;
    }
}