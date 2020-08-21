class Solution {
    public boolean isMonotonic(int[] A) {
        if(A==null||A.length<2) return true;
        boolean in = true, de = true;        
        for(int i=1;i<A.length;i++){
            if(A[i-1]>A[i])in = false;
            else if(A[i-1]<A[i]) de = false;
        }
        return in || de;
    }
}