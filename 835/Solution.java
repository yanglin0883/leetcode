class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int ans = 0;
        for(int i=-A.length+1;i<A.length;i++)
            for(int j=-A[0].length+1;j<A[0].length;j++){
                int count=0;
                for(int a=0;a<B.length;a++)
                    for(int b=0;b<B[0].length;b++){
                        if(out(A, a+i, b+j)) continue;
                        if(B[a][b]==1 &&A[a+i][b+j]==1) count++;
                    }
                ans = Math.max(ans, count);
                //System.out.println(ans+"  "+count);
            }
        return ans;
    }
    private boolean out(int[][]A, int i, int j){
        if(i<0||j<0||i>=A.length||j>=A[0].length) return true;
        else return false;
    }
}