class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        List<String> res= new ArrayList<>();
        Queue<Integer> bfs = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        bfs.offer(id);
        visited.add(id);
        int curLevel=0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            //System.out.println(bfs);
            for(int i=0;i<size;i++){
                int node = bfs.poll();
                if(curLevel==level){
                    //System.out.println("r  "+watchedVideos.get(node));
                    res.addAll(watchedVideos.get(node));
                }
                for(int j:friends[node]){
                    if(visited.contains(j))continue;
                    bfs.offer(j);
                    visited.add(j);
                }
            }
            ++curLevel;
            if(curLevel>level+2) break;
        }
        //System.out.println(res);
        return tidy(res);
    }
    List<String> tidy(List<String> input){
        TreeMap<String, Integer> ts = new TreeMap<>();
        for(String s:input){
            ts.put(s, ts.getOrDefault(s, 0)+1);
        }
        Set<String> k = ts.keySet();
        int max=1;
        for(String i:k){
            if(ts.get(i)>max) max = ts.get(i);
        }
        ArrayList<String> res = new ArrayList<>();
        for(int i=1;i<=max;i++){
            for(String j:k){
                if(ts.get(j)==i) res.add(j);
            }
        }
        return res;
    }
}