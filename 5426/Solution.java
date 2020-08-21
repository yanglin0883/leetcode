class Solution {
    public int minReorder(int n, int[][] c) {
        ArrayList<Integer>[] next = new ArrayList[n];
        ArrayList<Integer>[] pre = new ArrayList[n];
        for(int i=0;i<n;i++){
            next[i] = new ArrayList();
            pre[i] = new ArrayList();
        }
        for(int[]i:c){
            next[i[0]].add(i[1]);
            pre[i[1]].add(i[0]);
        }
        Queue<Integer> bfs = new LinkedList();
        Set<Integer> visited = new HashSet();
        int total=0;
        bfs.offer(0);
        visited.add(0);
        // System.out.println(bfs);
        while(!bfs.isEmpty()){
        // System.out.println(bfs);
            int cur = bfs.poll();            
            if(pre[cur].size()!=0){
                for(int i: pre[cur]){
                    if(visited.contains(i))continue;
                    visited.add(i);
                    bfs.offer(i);}
            }
            if(next[cur].size()!=0){
                for(int i:next[cur]){
                    if(visited.contains(i))continue;
                    visited.add(i);
                    bfs.offer(i);
                    total++;
                }
            }
        }
        return total;
    }
}