class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0;
        for(int i=0;i<A.length;i++)
            sumA += A[i];
        for(int i=0;i<B.length;i++)
            sumB += B[i];
        int dif = sumA - sumB >> 1;
        int[] ans = new int[2];
        for(int i=0;i<A.length;i++)
            for(int j=0;j<B.length;j++)
                if(A[i]-B[j] == dif){
                    ans[0] = A[i];
                    ans[1] = B[j];
                    return ans;
                }
        return ans;
    }
}