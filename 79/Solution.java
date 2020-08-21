class Solution {
    public boolean exist(char[][] board, String word) {
        if(word==null||word.length()==0) return true;
        if(board==null||board.length==0||board[0].length==0) return false;
        char[] str = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board, i, j, str, 0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][]board, int x, int y, char[]str, int index){
        if(!inBoard(board, x, y)) return false;
        if(board[x][y] == str[index]){
            if(index ==str.length-1) return true;
            board[x][y] = ' '; // backtracking
            int[] dX={1,-1,0,0};
            int[] dY={0,0,1,-1};
            boolean res =false;
            for(int i=0;i<4;i++){
                res = res||dfs(board, x+dX[i], y+dY[i], str, index+1);
            }
            board[x][y] = str[index];
            return res;
        }
        else return false;
    }
    private boolean inBoard(char[][]board, int x, int y){
        return x>-1&&x<board.length&&y>-1&&y<board[0].length;
    }
}