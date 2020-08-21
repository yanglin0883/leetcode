class Solution {
    public int orangesRotting(int[][] grid) {
        int min=0;
        while(flag){
            grid = nextStep(grid);
            if(flag)min++;
        }
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j] == 1) return -1;
        return min;
    }
    boolean flag = true;
    int[][] nextStep(int[][] grid){
        flag = false;
        int[][] temp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                temp[i][j] = grid[i][j];
        int[] x= {0,0,1,-1};
        int[] y = {1,-1,0,0};
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    for(int k=0;k<4;k++){
                        int c= i+x[k], r = j+y[k];
                        if(c<0||r<0||c>=grid.length||r>=grid[0].length||grid[c][r] != 1)
                            continue;
                        temp[c][r] = 2;
                        flag = true;
                    }
                }
            }
        return temp;
    }
}