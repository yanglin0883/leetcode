class Solution {
    public boolean isMonotonic(int[] A) {
        if(A==null||A.length<2) return true;
        boolean flag = A[0]<A[A.length-1];
        for(int i=1;i<A.length;i++){
            if(A[i-1]==A[i])continue;
            if(flag!=(A[i-1]<A[i])) return false;
        }
        return true;
    }
}