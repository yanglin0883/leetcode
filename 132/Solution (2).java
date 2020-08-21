class Solution {
    public int minCut(String s) {
        if(s==null||s.length()<2) return 0;
        this.s = s.toCharArray();
        t=new int[s.length()+1][s.length()+1];
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
    int[][]t;
    boolean isPalin(int a, int b){
        if(t[a][b]!=0){
            if(t[a][b]==1) return false;
            else return true;
        }
        // for(int[] i:t)System.out.println(Arrays.toString(i));
        // System.out.println(a+"  "+b);
        int left=a, right=b;
        while(a<b)if(s[a++]!=s[b--]) {
            t[left][right] = 1;
            return false;
        }
        t[left][right]=2;
        return true;
    }
}