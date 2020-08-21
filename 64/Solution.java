class Solution {
    public int minPathSum(int[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0) return 0;
        int dp[] = new int[grid[0].length];
        dp[0] = grid[0][0];
        for(int i=1;i<grid[0].length;i++)
            dp[i] = grid[0][i] + dp[i-1];
        // print(dp);
        for(int i=1;i<grid.length;i++){
            int[] temp = new int[grid[0].length];
            temp[0] =  dp[0]+grid[i][0];
            for(int j=1;j<grid[0].length;j++)
                temp[j] = grid[i][j] + Math.min(temp[j-1], dp[j]);
            dp = temp;
            //print(dp);
        }
        return dp[grid[0].length-1];
    }
    
    private void print(int[] dp){
        for(int k=0;k<dp.length;k++)
                System.out.print(dp[k]+", ");
            System.out.println();
    }
}