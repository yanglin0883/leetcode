class Solution {
    public int numRookCaptures(char[][] board) {
        int count =0 ;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != 'R') continue;
                for(int k=i+1;k<board.length;k++){
                    if(board[k][j]=='p'){
                        count++;
                        break;
                    }
                    if(board[k][j]>='A'&&board[k][j]<='Z')
                        break;
                }
                for(int k=i-1;k>-1;k--){
                    if(board[k][j]=='p'){
                        count++;
                        break;
                    }
                    if(board[k][j]>='A'&&board[k][j]<='Z')
                        break;
                }
                for(int k=j+1;k<board[0].length;k++){
                    if(board[i][k]=='p'){
                        count++;
                        break;
                    }
                    if(board[i][k]>='A'&&board[i][k]<='Z')
                        break;
                }
                for(int k=j-1;k>-1;k--){
                    if(board[i][k]=='p'){
                        count++;
                        break;
                    }
                    if(board[i][k]>='A'&&board[i][k]<='Z')
                        break;
                }
                return count;
            }
        return count;
    }
}