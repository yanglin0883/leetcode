class Solution {
    public void solveSudoku(char[][] board) {
        int blanks=0;
        char[][] temp = new char[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') blanks++;
                temp[i][j]=board[i][j];
            }
        }
        System.out.println(blanks);
        dfs(board, false, temp, 0, 0, blanks);
    }
    void dfs(char[][]res, boolean finished, char[][]cur, int x, int y, int blanks){
        if(finished||x>8) {
            // System.out.println(finished+"  "+x+"  "+blanks);
            for(int i=0;i<res.length;i++)
                for(int j=0;j<res[0].length;j++)
                    res[i][j] = cur[i][j];
            return;
        }
        if(cur[x][y]!='.'){
            if(y==8){x++;y=0;}
            else y++;
            dfs(res, finished, cur, x, y, blanks);
            return;
        }
        // System.out.println(x+"  "+y+"  "+blanks);
        for(char c='1';c<='9';c++){
            cur[x][y]=c;
            if(judge(cur)){
                // for(int i=0;i<9;i++){for(int j=0;j<9;j++)System.out.print(cur[i][j]+" ");System.out.println();}
                
                    blanks--;//这里多次改变了同一个变量， 应该只改变一次
                    int x1=x, y1=y;
                    if(y1==8){x1++;y1=0;}
                    else y1++;
                    // System.out.println(blanks+"  "+x+"  "+y);
                    dfs(res, finished, cur, x1, y1, blanks);
                
            }
        }
        cur[x][y] = '.';
    }
    boolean judge(char[][]cur){
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                //if(cur[i][j]=='.')continue;
                for(int k=j+1;k<9;k++){
                    //if(cur[i][k]=='.')continue;
                    // System.out.println("i= "+i+" j= "+j+" k= "+k);
                    if(cur[i][j]!='.' && cur[i][j]==cur[i][k] ) return false;
                    if(cur[j][i]!='.' && cur[j][i]==cur[k][i] ) return false;
                }
            }
        }
        for(int i=0;i<9;i+=3)
            for(int j=0;j<9;j+=3){
                boolean[] contained = new boolean[10];
                for(int a=0;a<3;a++)
                    for(int b=0;b<3;b++){
                        if(cur[i+a][j+b]=='.')continue;
                        int num = (int)(cur[i+a][j+b]-'0');
                        // if(num>9)for(int ia=0;ia<9;ia++){for(int ja=0;ja<9;ja++)System.out.print(cur[ia][ja]+" ");System.out.println();}
                        if(contained[num]) return false;
                        contained[num] = true;
                    }
            }
        return true;
    }
}