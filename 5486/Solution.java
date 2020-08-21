class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        this.cuts = cuts;
        return dfs(0, n,  0, cuts.length-1);
    }
    int[]cuts;
    Map<Pair, Integer> hm = new HashMap();
    int dfs(int left, int right, int start, int end){
        Pair cur = new Pair(left, right);        
        if(hm.containsKey(cur)) return hm.get(cur);
        
        if(end<start) {hm.put(cur, 0);return 0;}
        if(end==start) {hm.put(cur, right-left);return right-left;}
        int min=Integer.MAX_VALUE;
        // System.out.println(left+"  "+right);
        for(int i=start;i<=end;i++){
            min = Math.min(min, dfs(left, cuts[i], start, i-1) + dfs(cuts[i], right, i+1, end));
            // System.out.println(min+" "+i);
        }
        
        hm.put(cur, right-left+min);
        
        return right-left +min;
    }
    class Pair{
        int x,  y;
        Pair(int a, int b){
            x=a; y=b;
        }
        public int hashCode(){
            return x+y;
        }
        public boolean equals(Object a){
            if(a.getClass()!=this.getClass()) return false;
            Pair b = (Pair) a;
            if(this.x==b.x && this.y==b.y) return true;
            return false;
        }
    }
}