class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid == null||grid.length==0||grid[0].length==0) return 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }
    private int dfs(int[][] grid, int i, int j){
        if(outside(grid,i,j)||grid[i][j]==0) return 1;
        if(grid[i][j]==2) return 0;
        grid[i][j] =2;
        int perimeter=0;
        int[] x= {1,-1,0,0};
        int[] y= {0,0,1,-1};
        for(int a=0;a<4;a++)
            perimeter += dfs(grid, i+x[a], j+y[a]);
        return perimeter;
    }
    private boolean outside(int[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return true;
        else return false;
    }
}