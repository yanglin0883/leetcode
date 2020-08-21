class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=matrix.length;i>-1;i--){
            if(helper(matrix, i, 0)) return false;
        }
        for(int i=1;i<matrix[0].length;i++)
            if(helper(matrix, 0, i)) return false;
        return true;
    }
    
    private boolean helper(int a[][], int i, int j){
        for(int k=0;i+k<a.length&&j+k<a[0].length;k++)
            if(a[i+k][j+k] != a[i][j]) return true;
        return false;
    }
}