class Solution {
    public int[] sortedSquares(int[] A) {
        int mid =0;
        for(int i=0;i<A.length;i++){
            if(A[i]>=0){
                mid = i;
                break;
            }
        }
        int left = mid-1;
        int right = mid;
        int[] res = new int[A.length];
        for(int i=0;i<A.length;i++){
            if(left<0){
                while(right<A.length) res[i++] = square(A[right++]);
                break;
            }
            else if(right>=A.length){
                while(left>-1) res[i++] = square(A[left--]);
                break;
            }
            if(-A[left]<A[right]) res[i] = square(A[left--]);
            else res[i] = square(A[right++]);
        }
        return res;
    }
    int square(int a){
        return a*a;
    }
}