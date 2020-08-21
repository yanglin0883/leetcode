class Solution {
    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                int num = numOfN(board, i, j);
                if(board[i][j]==1){
                    if(num<2||num>3) temp[i][j] =0;
                    else temp[i][j] = 1;
                }
                else{
                    if(num==3) temp[i][j]=1;
                    else temp[i][j]=0;
                }                    
            }
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                board[i][j] = temp[i][j];
            }
    }
    private int numOfN(int[][] map, int a, int b){
        int res=0;
        int[] x ={-1,0,1};
        int[] y ={-1,0,1};
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                if(x[i]==0&&y[j]==0) continue;
                if(inMap(map,a+x[i], b+y[j])&&map[a+x[i]][b+y[j]]==1) res++;
            }
        return res;
    }
    private boolean inMap(int[][]map, int a, int b){
        if(a>-1&&a<map.length&&b>-1&&b<map[0].length)
            return true;
        return false;
    }
}