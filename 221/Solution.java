class Solution {
    public int maximalSquare(char[][] matrix) {
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                max = Math.max(max, maxSquare(matrix, i,j));
            }
        }
        return max*max;
    }
    int maxSquare(char[][] matrix, int i, int j){
        if(matrix[i][j]=='0') return 0;
        int k=0;
        for(;i+k<matrix.length&&j+k<matrix[0].length;k++){
            for(int q=0;q<=k;q++){
                if(matrix[i+k][j+q]=='0' || matrix[i+q][j+k]=='0') return k;
            }
        }
        return k;
    }
}