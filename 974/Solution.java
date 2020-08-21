class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int count=0;
        int sum[] = new int[A.length+1];
        sum[0] = 0;
        for(int i=1;i<sum.length;i++)
            sum[i] = sum[i-1] + A[i-1];
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<=A.length;j++){
                if((sum[j]-sum[i])%K==0)count++;
            }
        }
        return count;
    }
}