class Solution {
    public int projectionArea(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        return left(grid)+front(grid)+ bottom(grid);
    }
    int bottom(int[][] grid){
        int count =0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
                if(grid[i][j]>0) count++;
        return count;
    }
    int front(int [][] grid){
        int sum=0;
        for(int i=0;i<grid.length;i++){
            int max=grid[i][0];
            for(int j=1;j<grid[i].length;j++)
                max = Math.max(max, grid[i][j]);
            sum+=max;
        }
        return sum;
    }
    int left(int [][] grid){
        int sum=0;
        for(int i=0;i<grid[0].length;i++){
            int max=grid[0][i];
            for(int j=1;j<grid.length;j++)
                max = Math.max(max, grid[j][i]);
            sum+=max;
        }
        return sum;
    }
}