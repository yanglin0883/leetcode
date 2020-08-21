class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==target) return true;
            else if(matrix[i][0]>target) return false;
            else if(Arrays.binarySearch(matrix[i], target)>0){
                //System.out.println(Arrays.binarySearch(matrix[i],target));
                return true;}
        }
        return false;
    }
    
}