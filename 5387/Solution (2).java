class Solution {
    public int numberWays(List<List<Integer>> hats) {
        return dfs(hats, new TreeSet(), 0);
    }
    int mod = 1000000007;
    Map<String, Integer> map = new HashMap();
    
    int dfs(List<List<Integer>> hats, TreeSet<Integer> state, int cur){
        if(cur==hats.size()){
            return 1;
        }
        String label = state.toString()+new Integer(cur).toString();
        // if(map.containsKey(label)) return map.get(label);
        int res=0;
        for(int i:hats.get(cur)){
            if(!state.contains(i)){
                state.add(i);
                res += dfs(hats, state, cur+1);
                res %= mod;
        // System.out.println(cur+"  "+ state+" "+res +" i= "+i);
                state.remove(i);
            }
        }
        map.put(label, res);
        return res;
    }
}