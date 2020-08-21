class Solution {
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {      
        if(grid[r0][c0] == color) return grid;
        boolean[][] visited = new boolean[grid.length][grid[0].length];  
        dfs(grid, r0, c0, visited, grid[r0][c0], color);
        return grid;
    }
    
    private boolean dfs(int[][] grid, int r, int c, boolean[][] visited, int original, int color){
        if(outside(grid, r, c) || (grid[r][c] != original&&!visited[r][c])) return true;
        if(visited[r][c]) return false;
        visited[r][c] = true;
        
        boolean flag = false;
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        for(int i=0;i<4;i++)
            flag |= dfs(grid, r+x[i], c+y[i], visited, original, color);
        if(flag) grid[r][c] = color;
        return false;
    }
    private boolean outside(int[][] grid, int r, int c){
        if(r<0||c<0||r>=grid.length||c>=grid[0].length) return true;
        else return false;
    }
}