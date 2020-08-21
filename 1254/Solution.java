class Solution {
    public int closedIsland(int[][] grid) {
        if(grid==null || grid.length<3 || grid[0].length<3) return 0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0&&dfs(grid, i, j)) count++;//suitable entry
                // System.out.println("This is main "+i+"  "+j+"  "+count);
            }
        }
        return count;
    }
    boolean dfs(int[][] grid, int x, int y){
        if(!inBound(grid, x, y)) return true;
        if(grid[x][y]!=0) return true;
        grid[x][y]=2;
        boolean res = true;
        if(x==0||y==0||x==grid.length-1||y==grid[0].length-1) { // -1
            res = false;
            // System.out.println("should be false "+x+" "+y+" "+res);
        }
        int[] dX = {0,0,1,-1};
        int[] dY = {1,-1,0,0};
        for(int i=0;i<4;i++){
            res = res & dfs(grid, x+dX[i], y+dY[i]);//short cut opreation
        }
        // System.out.println(x+" "+y+"  "+res);
        return res;
    }
    boolean inBound(int[][]grid, int x, int y){
        return x>=0&&y>=0&&x<grid.length&&y<grid[0].length;
    }
}