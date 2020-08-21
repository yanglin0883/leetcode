class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for(int i=0;i<res.length;i++)
            for(int j=0;j<res[0].length;j++)
                res[i][j] = helper(M, i, j);
        return res;
    }
    private int helper(int[][] M, int x, int y){
        int sum =0, count=0;
        int[] col = {-1,0,1};
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(inside(M, x+col[i], y+col[j])){
                    sum+=M[x+col[i]][y+col[j]];
                    count++;
                }
        return sum / count;
    }
    private boolean inside(int[][] M, int x, int y){
        return x>-1&&x<M.length&&y>-1&&y<M[0].length;
    }
}