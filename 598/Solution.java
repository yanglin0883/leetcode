class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops==null||ops.length==0) return m*n;
        int mina=ops[0][0], minb = ops[0][1];
        for(int i=1;i<ops.length;i++){
            mina = Math.min(ops[i][0], mina);
            minb = Math.min(ops[i][1], minb);
        }
        return mina * minb;
    }
}