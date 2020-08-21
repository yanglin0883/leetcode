class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, Map<Integer, Integer>> g = new HashMap<>();
        for(int i=0;i<n;i++){
            g.put(i, new HashMap<Integer, Integer>());
        }
        for(int[] e:edges){
            g.get(e[0]).put(e[1], e[2]);
            g.get(e[1]).put(e[0], e[2]);
        }
        int min = n+1;
        int res = -1;
        for(int i=0;i<n;i++){
            int count=0;
            
            Queue<int[]> q = new PriorityQueue<>((p1, p2)->p2[1]-p1[1]);
            q.add(new int[]{i, distanceThreshold});
            Set<Integer> visited = new HashSet<>();
            while(!q.isEmpty()){
                int[] city = q.poll();
                if(visited.contains(city[0])) continue;
                visited.add(city[0]);
                count++;
                Map<Integer, Integer> m = g.get(city[0]);
                for(int nei:m.keySet()){
                    if(!visited.contains(nei) && city[1] >= m.get(nei)){
                        q.add(new int[]{nei, city[1]-m.get(nei)});
                    }
                }
            }
            
            if(count-1<=min){
                min = count-1;
                res = i;
            }
        }
        return res;
    }
}