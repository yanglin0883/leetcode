class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        int[][] map = new int[hm.size()][2];
        int in =0;
        for(Integer i:hm.keySet()){
            map[in][0] = i;
            map[in++][1] = hm.get(i);
        }
        dfs(map, 0, new ArrayList<Integer>());
        return res;
    }
    List<List<Integer>> res = new ArrayList<>();
    void dfs(int[][] map, int current, ArrayList<Integer> path){
        if(current == map.length){
            res.add(path);
            return;
        }
        dfs(map, current+1, path);
        ArrayList<Integer> last = path;
        for(int i=0;i<map[current][1];i++){
            ArrayList<Integer> temp= new ArrayList<>(last);
            temp.add(map[current][0]);
            dfs(map, current+1, temp);
            last = temp;
        }
    }
}