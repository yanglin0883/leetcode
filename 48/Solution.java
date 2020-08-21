class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        for(int i=0; i<(len+1)/2;i++){
            for(int j=0;j<len/2;j++){
                rotate(matrix, i, j);
            }
        }
        // if(len%2==1){
        //     for(int i=0;i<len/2;i++){
        //         rotate(matrix, i, len/2+1);
        //     }
        // }
    }
    private void rotate(int[][] map, int i, int j){
        int len = map.length-1;
        int temp = map[i][j];
        map[i][j] =  map[len-j][i];
        map[len-j][i] = map[len-i][len-j];
        map[len-i][len-j] = map[j][len-i];
        map[j][len-i] = temp;
    }
}