class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min = A[0];
        int max = A[0];
        for(int i=1;i<A.length;i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        return Math.max(0, max-min - 2*Math.abs(K));
    }
}