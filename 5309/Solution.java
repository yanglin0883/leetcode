class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        Map<Integer, ArrayList<Integer>> neibor = new HashMap();
        for(int i=0;i<n;i++){
            neibor.put(i, new ArrayList<Integer>());
        }
        for(int[] a:connections){
            neibor.get(a[0]).add(a[1]);
            neibor.get(a[1]).add(a[0]);
        }
        Set<Integer> visited = new HashSet<>();
        int total =0;
        for(int i=0;i<n;i++){
            if(visited.contains(i)) continue;
            total++;
            Queue<Integer> bfs = new LinkedList();
            bfs.offer(i);
            visited.add(i);
            //System.out.println(i);
            while(!bfs.isEmpty()){
                int node = bfs.poll();
                //System.out.println(node+"  "+bfs+"  "+visited);
                for(Integer nei:neibor.get(node)){
                    if(visited.contains(nei)) continue;
                        bfs.offer(nei);
                        visited.add(nei);
                }
            }
        }
        return total-1;
    }
}