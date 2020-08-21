class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList();
        t1:for(int i=0;i<matrix.length;i++){
            int min = 0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][min]>matrix[i][j]) min = j;
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][min]<matrix[j][min]) continue t1;
            }
            res.add(matrix[i][min]);
        }
        return res;
    }
}