class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                edit(board, i, j);
            }
            // System.out.println();
        }
        
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board[0].length;j++){
        //         System.out.print(board[i][j]+"  ");
        //     }
        //     System.out.println();
        // }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] >>= 1;
            }
        }
    }
    
    private void edit(int[][]board, int i, int j){
        int nei = neighbour(board, i, j);
        // System.out.print(nei+"  ");
        if((board[i][j]&1)==0){
            if(nei==3)board[i][j]+=2;
        }
        else {
            switch(nei){
                case 2: case 3: board[i][j]+=2;
            }
        }
    }
    
    private int neighbour(int[][]board, int x, int y){
        int[] dX = {-1,0,1};
        int[] dY ={-1,0,1};
        int res=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                if(dX[i]==0&&dY[j]==0)continue;
                int xx = x+dX[i], yy = y+dY[j];
                if(xx<0||yy<0||xx>=board.length||yy>=board[0].length) continue;
                res +=  board[xx][yy] & 1;
            }
        return res;
    }
}