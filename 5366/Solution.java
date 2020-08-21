class Solution {
    int m,n;
    boolean flag = false;
    boolean vis[][];
    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        // System.out.println(m+"   "+n);
        if(m==1&&n==1) return true;
        vis = new boolean[m][n];
        vis[0][0] = true;
        if(grid[0][0]==1 ||grid[0][0]==6) dfs(grid, 0, 1, 1);
        else if(grid[0][0]==2 ||grid[0][0]==3) dfs(grid, 1, 0, 2);
        else if(grid[0][0]==4){dfs(grid, 0, 1, 1);dfs(grid, 1, 0, 2);}
        return flag;
    }
    
    void dfs(int[][]grid, int x, int y, int dir){
        if(x<0||x>=m||y<0||y>=n||vis[x][y]) return;
        if(!connected(grid, x, y, dir)  )  return;
        if(x==m-1 &&y==n-1) {
            flag=true;
        }
        if(flag)return;
        // System.out.println(x+" "+y+" :: "+dir);
        vis[x][y] = true;
        switch(grid[x][y]){
            case 1:dfs(grid, x, y+1, 1);dfs(grid, x, y-1, 3); break;
            case 2:dfs(grid, x+1, y, 2);dfs(grid, x-1, y, 4); break;
            case 3:dfs(grid, x+1, y, 2);dfs(grid, x, y-1, 3); break;
            case 4:dfs(grid, x+1, y, 2);dfs(grid, x, y+1, 1); break;
            case 5:dfs(grid, x-1, y, 4);dfs(grid, x, y-1, 3); break;
            case 6:dfs(grid, x-1, y, 4);dfs(grid, x, y+1, 1); break;
        }
    }
    boolean connected(int[][]grid, int x, int y, int dir){
        switch(dir){
            case 1: return grid[x][y]%2==1;
            case 2: return grid[x][y]==2||grid[x][y]==5||grid[x][y]==6;
            case 3: return grid[x][y]==1||grid[x][y]==4||grid[x][y]==6;
            case 4: return grid[x][y]==2||grid[x][y]==3||grid[x][y]==4;
        }
        return true;
    }
}