class Solution {
    public int minCut(String s) {
        if(s==null||s.length()<2) return 0;
        this.s = s.toCharArray();
        return dfs(0);
    }
    char[]s;
    Map<Integer, Integer> map = new HashMap();
    int dfs(int cur){
        if(cur>=s.length-1 || isPalin(cur, s.length-1)) {
            map.put(cur, 0);
            return 0;
        }
        if(map.containsKey(cur)) return map.get(cur);
        int min = s.length;
        for(int i=cur;i<s.length;i++){
            if(!isPalin(cur, i))continue;
        // System.out.println(cur+"  "+i+"  "+min);
            min = Math.min(min, dfs(i+1));
        }
        map.put(cur, min+1);
        return min+1;
    }
    boolean isPalin(int a, int b){
        while(a<b)if(s[a++]!=s[b--]) return false;
        return true;
    }
}