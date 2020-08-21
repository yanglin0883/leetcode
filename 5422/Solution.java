class SubrectangleQueries {

    public SubrectangleQueries(int[][] rectangle) {
        rec = rectangle;
    }
    int[][] rec;
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i=row1;i<=row2 && i<rec.length;i++)
            for(int j=col1;j<=col2 && j<rec[0].length;j++)
                rec[i][j] = newValue;
        // for(int[] a:rec)System.out.println(Arrays.toString(a));
    }
    
    public int getValue(int row, int col) {
        return rec[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */