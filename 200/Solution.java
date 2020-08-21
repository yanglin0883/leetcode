class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid, i,j);
                }
            }
        }
        return count;
    }
    
    private void dfs(char[][] grid, int i, int j){
        if(outside(grid, i, j)) return;
        if(grid[i][j]!='1') return;
        grid[i][j] = '2'; // visied
        
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        for(int a=0;a<4;a++)
            dfs(grid, i+x[a], j+y[a]);
    }
    
    private boolean outside(char[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return true;
        else return false;
    }
}