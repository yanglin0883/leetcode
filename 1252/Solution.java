class Solution {
    public int surfaceArea(int[][] grid) {
        int N = grid.length;
        int top=0, left=0, front=0;
        for(int i=0;i<N;i++){
            int max1=0;
            int max2=0;
            for(int j=0;j<N;j++){
                if(grid[i][j]!=0) top++;
                if(j==0){
                    max1=grid[i][j];
                    max2=grid[j][i];
                }else{
                    if(grid[i][j]>grid[i][j-1]) max1+=grid[i][j] - grid[i][j-1];
                    if(grid[j][i]>grid[j-1][i]) max2+=grid[j][i] - grid[j-1][i];
                }
            }
            left+=max1;
            front+=max2;
        }
        return (top+left+front)*2;
    }
}