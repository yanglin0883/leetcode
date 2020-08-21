class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    count++;
                    count += helper(matrix, i, j);
                }
            }
        }
        return count;
    }
    int helper(int[][] mat, int x, int y){
        int max = Math.min(mat.length-x, mat[0].length-y);
        for(int i=1;i<max;i++){
            if(containsZero(mat, x, y, i))return i-1;
        }
        return max-1;
    }
    boolean containsZero(int[][]mat, int x, int y, int k){
        for(int i=0;i<=k;i++){
            if(mat[x+k][y+i]==0 || mat[x+i][y+k]==0) return true;
        }
        return false;
    }
}