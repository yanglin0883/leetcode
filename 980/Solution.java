class Solution {
    public int uniquePathsIII(int[][] grid) {
        int zeros = 0, startx=0,starty=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    startx=i;starty=j;
                }
                else if(grid[i][j]==0)zeros++;
            }
        }
        return dfs(grid, zeros+1, startx, starty, visited);//+1 is for start point
    }
    
    int dfs(int[][]grid, int z, int x, int y, boolean[][]visited){
        if(x<0||y<0||x>=grid.length||y>=grid[0].length||visited[x][y]||grid[x][y]==-1) return 0;
        if(grid[x][y]==2)return (z==0)? 1:0;
        visited[x][y] = true;
        int[]dX = {0,0,1,-1};
        int[]dY = {1,-1,0,0};
        int res=0;
        for(int i=0;i<4;i++)
            res += dfs(grid, z-1, x+dX[i],y+dY[i], visited);
        visited[x][y] = false;
        // System.out.println(res+"  "+ z);
        return res;
    }
}