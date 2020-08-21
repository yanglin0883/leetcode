class Solution {
    public void setZeroes(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        boolean visited[][] = new boolean[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(!visited[i][j]){
                    visited[i][j]=true;
                    if(matrix[i][j]==0)
                        fill(matrix, visited,i,j);
                }
            }
        }
    }
    private void fill(int[][] matrix, boolean[][] visited,int col, int row){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][row]!=0)
            visited[i][row] = true; 
            matrix[i][row] = 0;
        }
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[col][j]!=0)
            visited[col][j] = true;
            matrix[col][j] = 0;
        }
    }
}