class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] p = new int[m];
        for(int i=0;i<m;i++)
            p[i] = i+1;
        int[] res = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            res[i] = doit(p, queries[i]);
        }
        return res;
    }
    public int doit(int[]p, int q){
        for(int i=0;i<p.length;i++){
            if(p[i]==q){
                for(int j=i;j>0;j--)
                    p[j] = p[j-1];
                p[0] = q;
                return i;
            }
        }
        return -1;
    }
}