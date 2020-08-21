class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        if(words==null||words.length==0||board==null||board.length==0||board[0].length==0)
            return res;
        for(String word:words){
            boolean exist = false;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    exist = exist||dfs(board, i, j, word, 0);
                }
            }
            if(exist) res.add(word);
        }
        return res;
    }
    private boolean dfs(char[][]board, int x, int y, String word, int index){
        if(index == word.length()) return true;
        if(!inBound(board, x, y)) return false;
        if(board[x][y] == word.charAt(index)){
            //System.out.println(board[x][y]+"  "+x+"  "+y);
            board[x][y] = '#';
            int[] dX={0,0,1,-1},dY={1,-1,0,0};
            boolean judge = false;
            for(int i=0;i<4;i++){
                judge = judge||dfs(board, x+dX[i], y+dY[i], word, index+1);
                //System.out.println(judge);
            }
            board[x][y] = word.charAt(index);
            return judge;
        }
        return false;
    }
    private boolean inBound(char[][]board, int x, int y){
        return x>-1&&x<board.length&&y>-1&&y<board[0].length;
    }
}