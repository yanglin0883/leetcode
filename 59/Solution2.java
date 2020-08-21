class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int size = (n+1)/2;
        int count=1;
        for(int i=0;i<size;i++){
            ans[i][i] = count;
            for(int j=i;j<n-i-1;j++){
                ans[i][j] = count++;
            }
            for(int j=i;j<n-i-1;j++){
                ans[j][n-i-1] = count++;
            }
            for(int j=i;j<n-i-1;j++){
                ans[n-i-1][n-j-1] = count++;
            }
            for(int j=i;j<n-i-1;j++){
                ans[n-j-1][i] = count++;
            }
        }
        return ans;
    }
}