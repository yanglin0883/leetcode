class NumMatrix {
    int[][]mat;

    public NumMatrix(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return;
        mat = new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<mat.length;i++)
            for(int j=1;j<mat[0].length;j++){
                mat[i][j] = mat[i][j-1]+mat[i-1][j]+matrix[i-1][j-1]-mat[i-1][j-1];
            }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return mat[row2+1][col2+1]-mat[row1][col2+1]-mat[row2+1][col1]+mat[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */