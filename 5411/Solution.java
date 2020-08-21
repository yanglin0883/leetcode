class Solution {
    public int cherryPickup(int[][] grid) {
        int[][][] dp = new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++)
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
        }
        dp[0][0][grid[0].length-1] = grid[0][0] + grid[0][grid[0].length-1];
        for(int i=1;i<grid.length;i++){
            for(int left=0;left<grid[0].length;left++){
                for(int right=0;right<grid[0].length;right++){
                    int max=Integer.MIN_VALUE;
                    for(int a=left-1;a<=left+1;a++){
                        if(a<0||a>=grid[0].length) continue;
                        for(int b=right-1;b<=right+1;b++){
                            if(b<0||b>=grid[0].length) continue;
                            max = Math.max(max, dp[i-1][a][b]);
                        }
                    }
                    // System.out.println(max);
                    dp[i][left][right] = max + ((left==right)?grid[i][left]:grid[i][left] + grid[i][right]);
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++)                
            System.out.println(Arrays.toString(dp[i][j]));
            System.out.println("--");
        }
        int max=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid[0].length;j++){
                max = Math.max(max, dp[grid.length-1][i][j]);
            }
        }
        return max;
    }
}