class Solution {
    class Neighbor{
        int nei;
        double p;
        Neighbor(int n, double q){
            nei=n;
            p=q;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        ArrayList<Neighbor>[] next = new ArrayList[n];
        for(int i=0;i<n;i++)next[i] = new ArrayList();
        for(int i=0;i<edges.length;i++){
            next[edges[i][0]].add( new Neighbor(edges[i][1], succProb[i]));
            next[edges[i][1]].add( new Neighbor(edges[i][0], succProb[i]));
        }
        dfs(start, end, 1.0, next, new HashSet());
        if(max>1) return 0.0;
        return max;
    }
    double max = 0.0;
    void dfs(int start, int end, double cur, ArrayList<Neighbor>[]next, Set<Integer> visited){
        if(start==end){
            max = Math.max(max, cur);
            return;
        }
        visited.add(start);
        for(Neighbor nei: next[start]){
            if(visited.contains(nei.nei))continue;
            dfs(nei.nei, end, cur*nei.p, next, visited);
        }
        visited.remove(start);
    }
}
//time