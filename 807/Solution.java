class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int c = grid.length;
        int r = grid[0].length;
        int skyline1[] = new int[c];
        int skyline2[] = new int[r];
        for(int i=0;i<c;i++){
            int max = grid[i][0];
            for(int j=1;j<r;j++)
                max = Math.max(max, grid[i][j]);
            skyline1[i] = max;
        }
        for(int i=0;i<r;i++){
            int max = grid[0][i];
            for(int j=1;j<c;j++)
                max = Math.max(max, grid[j][i]);
            skyline2[i] = max;
        }
        int total = 0;
        for(int i=0;i<c;i++)
            for(int j=0;j<r;j++)
                total += Math.min(skyline1[i], skyline2[j]) - grid[i][j];
        return total;
    }
}