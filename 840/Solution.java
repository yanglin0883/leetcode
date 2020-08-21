class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length-2;i++)
            for(int j=0;j<grid[0].length-2;j++){
                if(check(grid, i, j))count++;                
            }
        return count;
    }
    private  boolean check(int[][] grid, int x, int y){
        int nums[] = new int[9];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                if(grid[x+i][y+j]==0 || grid[x+i][j+y]>9) return false;
                nums[grid[x+i][y+j]-1]++;}
        for(int i=0;i<9;i++)
            if(nums[i]!=1) return false;
        if(grid[x+1][y+1]!=5) return false;
        if(grid[x][y]+grid[x+2][y+2]!=10) return false;
        if(grid[x][y+1]+grid[x+2][y+1]!=10) return false;
        if(grid[x][y+2]+grid[x+2][y]!=10) return false;
        if(grid[x+1][y]+grid[x+1][y+2]!=10) return false;
        if(grid[x][y]+grid[x+1][y]+grid[x+2][y]!=15) return false;
        if(grid[x][y]+grid[x][y+1]+grid[x][y+2]!=15) return false;
        return true;
    }
}