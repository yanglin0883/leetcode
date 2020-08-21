class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int res[] = new int[n];
        if(n<2) return res;
        int index=0;
        
        int[] indegree = new int[n];
        ArrayList<Integer>[] next = new ArrayList[n];
        for(int i=0;i<n;i++)
            next[i] = new ArrayList<Integer>();
        for(int[] i:pre){
            indegree[i[0]]++;
            next[i[1]].add(i[0]);
        }
        Queue<Integer> bfs = new LinkedList();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) bfs.offer(i);
        }
        while(!bfs.isEmpty()){
            int temp = bfs.poll();
            res[index++] = temp;
            for(int ne:next[temp]){
                if(--indegree[ne] != 0) continue;
                bfs.offer(ne);
            }
        }
        // for(int i: res)System.out.print(i+"  ");
        // System.out.println("\n"+index);
        if(index==n) return res;
        else return new int[0];
    }
}