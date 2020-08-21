class Solution {
    public int countBattleships(char[][] board) {
        if(board==null||board.length==0||board[0].length==0) return 0;
        Set<Pair> res = new HashSet();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    res.add(dfs(board, i, j));
                    // System.out.println(res+"  "+i+"  "+j);
                }
            }
        }
        return res.size();
    }
    class Pair{
        Pair(int x, int y, int a, int b){
            x1=x;x2=a;y1=y;y2=b;
        }
        int x1, x2,y1,y2;
        public int hashCode(){
            return x1+x2*10+y1*100+y2*1000;
        }
        public boolean equals(Object o){
            if(o.getClass()!=this.getClass())return false;
            Pair p = (Pair)o;
            return p.toString().equals(this.toString());
        }
        public String toString(){
            return "(x1="+x1+", y1="+y1+", x2="+x2+", y2="+y2+")";
        }
    }
    Pair dfs(char[][]board, int x, int y){
        if((x+1<board.length && board[x+1][y]=='X') 
           || (x-1>-1 && board[x-1][y]=='X')){
            int left=x, right=x;
            while(left>=0&&board[left][y]=='X')left--;
            while(right<board.length && board[right][y]=='X')right++;
            return new Pair(left, y ,right, y);
        }
        else{
            int up=y, down=y;
            while(up>=0 && board[x][up]=='X')up--;
            while(down<board[0].length && board[x][down]=='X')down++;
            return new Pair(x, up,x, down);
        }
    }
}