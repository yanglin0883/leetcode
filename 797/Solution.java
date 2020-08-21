class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> path = new ArrayList();
        path.add(0);
        dfs(0,graph, res, path);
        return res;
    }
    void dfs(int cur, int[][] graph, List<List<Integer>> res, List<Integer> path){
        if(cur==graph.length-1){
            res.add(new ArrayList(path));
            return;
        }
        for(int i: graph[cur]){
            if(path.contains(i))continue;
            path.add(i);
            dfs(i, graph, res, path);
            path.remove(path.size()-1);
        }
    }
}