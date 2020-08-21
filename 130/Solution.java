class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length<3|| board[0].length<3) return;
        //'O': unvisited; 'X': barries; 'V': visited,but still 'O'
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&& !dfs(board,i,j)) refill(board, i,j, 'X');                    
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='V') refill(board, i,j, 'O');                    
            }
        }
    }
    
    private boolean dfs(char[][] map, int x, int y){
        if(outOfMap(map, x, y)) return true;
        //System.out.println(x+" "+y);
        if(map[x][y]!='O') return false;
        map[x][y] = 'V';
        return dfs(map, x-1, y)|dfs(map, x+1,y)|
                dfs(map, x, y-1)|dfs(map, x,y+1);       
    }
    
    private boolean outOfMap(char[][] map, int x, int y){
        if(x<0||y<0||x>=map.length||y>=map[0].length) return true;
        else return false;
    }
    
    private void refill(char[][] map, int x, int y, char c){
        if(outOfMap(map, x, y)) return;
        if(map[x][y]!='V') return;
        map[x][y] = c;
        refill(map, x+1, y, c); refill(map, x-1, y, c); 
        refill(map, x, y+1, c); refill(map, x, y-1, c);
    }
}