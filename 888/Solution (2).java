class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0;
        for(int i=0;i<A.length;i++)
            sumA += A[i];
        for(int i=0;i<B.length;i++)
            sumB += B[i];
        int dif = sumA - sumB >> 1;
        int[] ans = new int[2];
        HashSet<Integer> hs = new HashSet<>();
        for(int j=0;j<B.length;j++){
            hs.add(B[j]);
        }
        for(int i=0;i<A.length;i++)
            if(hs.contains(A[i]-dif)){
                ans[0] = A[i]; ans[1] = A[i]-dif;
                return ans;
            }
        return ans;
    }
}