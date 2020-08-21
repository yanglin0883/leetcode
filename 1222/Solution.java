class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        boolean[][] board = new boolean[8][8];
        for(int i=0;i<queens.length;i++){
            board[queens[i][0]][queens[i][1]] = true;
        }
        List<List<Integer>> res = new ArrayList<>();
        int[] dX = {1,-1,0,0,1,1,-1,-1};
        int[] dY = {0,0,1,-1,1,-1,1,-1};
        for(int j=0;j<8;j++)
        for(int i=0;i<8;i++){
            int x = king[0]+i*dX[j];
            int y = king[1]+i*dY[j];
            if(x<0||x>7||y<0||y>7)break;
            if(board[x][y]){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(x);
                temp.add(y);
                res.add(temp);
                break;
            }
        }
        return res;
    }
}