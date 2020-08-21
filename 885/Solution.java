class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res = new int[R*C][2];
        int index=0;
        int[] dr = {0,1,0,-1};
        int[] dc =  {1,0,-1,0};
        res[index++] = new int[]{r0, c0};
        if(R*C==1) return res;
        
        for(int k=1;k<2*(R+C);k+=2)
            for(int i=0;i<4;i++){
                int dk = k+(i/2);
                for(int j=0;j<dk;j++){
                    r0+=dr[i];
                    c0+=dc[i];
                    if(0<=r0&&r0<R && 0<=c0&&c0<C){
                        res[index++] = new int[]{r0, c0};
                        if(index== R*C) return res;
                    }
                }
            }
        return res;
    }
}