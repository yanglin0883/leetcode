class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] res =new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                if(A[i][j]==0) res[i][col-1-j] = 1;
        return res;
    }
}