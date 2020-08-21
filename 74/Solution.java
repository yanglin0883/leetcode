class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0||matrix[0].length==0) return false;
        int left=0, right=matrix.length, mid=0, res=0;
        while(left<right){
            mid = left+(right-left>>1);
            //System.out.println(left+"  "+mid+"  "+right);
            if(target==matrix[mid][0]) return true;
            else if(matrix[mid][0]>target) right = mid; 
            else if(mid==matrix.length-1||matrix[mid+1][0]>target){
                res = mid;
                break;
            }
            else left = mid+1;
        }
        // System.out.println(res);
        // System.out.println(Arrays.binarySearch(matrix[res], target));
        if(Arrays.binarySearch(matrix[res], target)>=0) return true;
        else return  false;
    }
}