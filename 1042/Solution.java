class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap();
        for(int i=1;i<=N;i++)
            graph.put(i, new ArrayList());
        for(int[] temp:paths){
            graph.get(temp[0]).add(temp[1]);
            graph.get(temp[1]).add(temp[0]);
        }
        Map<Integer, Integer> colors = new HashMap();
        for(int i=1;i<=N;i++)
                dfs(i, graph, colors);
        
        int[] gardens = new int[N];
        for(int i=0;i<N;i++)
            gardens[i] = colors.get(i+1);
        return gardens;
    }
    private void dfs(int cur, 
                     Map<Integer, ArrayList<Integer>> graph, 
                     Map<Integer, Integer> colors){
        if(colors.containsKey(cur)) return;
        Set<Integer> exist = new HashSet();
        for(Integer nei:graph.get(cur))
            if(colors.containsKey(nei))exist.add(colors.get(nei));
        for(int i=1;i<5;i++)
            if(!exist.contains(i)){
                colors.put(cur, i);
                break;
            }
        for(Integer nei: graph.get(cur)){
            if(!colors.containsKey(nei))
                dfs(nei, graph, colors);
        }
    }
}