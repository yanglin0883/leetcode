class Solution {
    public int numberWays(List<List<Integer>> hats) {
        StringBuilder state = new StringBuilder("0000000000000000000000000000000000000000000");
        return dfs(hats, state, 0);
    }
    int mod = 1000000007;
    Map<String, Integer> map = new HashMap();
    
    int dfs(List<List<Integer>> hats, StringBuilder state, int cur){
        if(cur==hats.size()){
            return 1;
        }
        String label = state.toString()+new Integer(cur).toString();
        if(map.containsKey(label)) return map.get(label);
        int res=0;
        for(int i:hats.get(cur)){
            if(state.charAt(i)=='0'){
                state.setCharAt(i,'1');
                res += dfs(hats, state, cur+1);
                res %= mod;
        // System.out.println(cur+"  "+ state+" "+res +" i= "+i);
                state.setCharAt(i,'0');
            }
        }
        map.put(label, res);
        return res;
    }
}