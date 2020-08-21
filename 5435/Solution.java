class Solution {
    public int minNumberOfSemesters(int n, int[][] dependencies, int k) {
        int[] indegree = new int[n+1];
        int[] outdegree = new int[n+1];
        int[][] g = new int[n+1][n+1];
        for(int[] i:dependencies){
            indegree[i[1]]++;
            outdegree[i[0]]++;
            g[i[0]][i[1]] = 1;
        }
        int[]depth = getDepth(g);
        // System.out.println(Arrays.toString(depth));
        PriorityQueue<Integer> bfs = new PriorityQueue<>((a,b)->depth[b]-depth[a]);
        for(int i=1;i<=n;i++)
            if(indegree[i]==0) bfs.offer(i);
        int res=0;
        while(!bfs.isEmpty()){
            res++;
            int size = bfs.size();
            List<Integer> temp = new ArrayList();
            System.out.println(bfs);
            for(int i=0;i<size && i<k;i++){
                int node = bfs.poll();
                for(int a=1;a<g[node].length;a++){
                    if(g[node][a]==1 && --indegree[a]==0) 
                        temp.add(a);
                }
            }
            bfs.addAll(temp);
        }
        return res;
    }
    int[] getDepth(int[][]g){
        int n = g.length-1;
        int[] depth = new int[g.length];
        int[] outdegree = new int[g.length];
        for(int i=0;i<g.length;i++){
            for(int s:g[i])
                outdegree[i] += s;
        }
        
        // System.out.println(Arrays.toString(outdegree));
        Queue<Integer> bfs = new LinkedList();
        for(int i=1;i<=n;i++)
            if(outdegree[i]==0) bfs.offer(i);
        int level=0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0;i<size;i++){
                int node = bfs.poll();
                // System.out.println(node+"  "+level);
                depth[node] = level;
                for(int a=1;a<=n;a++)
                    if(g[a][node]==1 && --outdegree[a]==0)
                        bfs.offer(a);
            }
            level++;
        }
        return depth;
    }
}