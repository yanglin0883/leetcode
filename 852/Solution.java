class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if(A.length<3) return -1;
        int left = 1;
        int right = A.length-2;
        int mid = (left+right)>>1;
        while(left<=right){
            mid = (left+right)>>1;
            //System.out.println("left= "+left+" mid= "+mid+" right= "+right+"  "+isPeak(A, mid));
            if(isPeak(A,mid)) return mid;
            if(isLeft(A,mid)) left = mid+1;
            if(isRight(A,mid)) right = mid-1;
        }
        //if(isPeak(A,mid+1)) return mid+1;
        return mid;
    }
    
    private boolean isLeft(int[] A, int i){
        // the input is [1,A.length-2]
        if(A[i-1]<A[i]&&A[i]<A[i+1])
            return true;
        return false;
    }
    private boolean isRight(int[] A, int i){
        if(A[i-1]>A[i]&&A[i]>A[i+1])
            return true;
        return false;
    }
    private boolean isPeak(int[] A, int i){
        if(A[i-1]<A[i]&&A[i]>A[i+1])
            return true;
        return false;
    }
}