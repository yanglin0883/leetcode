class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int[] col = new int[9];
            int[] row = new int[9];
            for(int j=0;j<9;j++){
                //System.out.println(i+"  "+j);
                if(board[i][j]!='.') col[board[i][j]-'0'-1]++;
                if(board[j][i]!='.') row[board[j][i]-'0'-1]++;
            }
            for(int j=0;j<9;j++)
                if(col[j]>1 || row[j]>1) return false;
        }
        
        for(int i=0;i<9;i+=3)
            for(int j=0;j<9;j+=3){
                int[] box = new int[9];
                for(int a=0;a<3;a++)
                    for(int b=0;b<3;b++){
                        //System.out.println(i+" "+j+" "+a+" "+b);
                        char temp = board[i+a][j+b];
                        if(temp!='.') box[temp-'0'-1]++;
                    }
                for(int k=0;k<9;k++)
                    if(box[k]>1) return false;
            }
        return true;
    }    
}