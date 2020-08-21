class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3) return false;
        int peak=-1;
        for(int i=1;i<A.length;i++){
            if(A[i] == A[i-1]) return false;
            if(A[i]<A[i-1]){
                peak = i;
                break;
            }
        }
        if(peak==1||peak==-1) return false;
        for(int i=peak;i<A.length;i++){
            if(A[i]>=A[i-1]) return false;
        }
        return true;
    }
}