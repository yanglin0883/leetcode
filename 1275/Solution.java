class Solution {
    public String tictactoe(int[][] moves) {
        int map[][] = new int[3][3];
        for(int i=0;i<moves.length;i++){
            map[moves[i][0]][moves[i][1]] = i%2 + 1;
            int temp = checkWin(map);
            if(temp==0) continue;
            return temp == 1 ? "A":"B";
        }
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(map[i][j] == 0) return "Pending";
        return "Draw";
    }
    
    private int checkWin(int[][] map){
        for(int i=0;i<3;i++){
            if(map[i][0]!=0 && map[i][0] == map[i][1]&& map[i][1] ==map[i][2]) return map[i][0];
            if(map[0][i]!=0 && map[0][i] == map[1][i]&& map[0][i] == map[2][i]) return map[0][i];
        }
        if(map[0][0]!=0&&map[0][0]==map[1][1]&&map[0][0]==map[2][2]) return map[0][0];
        if(map[0][2]!=0&&map[0][2]==map[1][1]&&map[1][1] == map[2][0]) return map[1][1];
        return 0;
    }
}