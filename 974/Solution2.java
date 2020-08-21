class Solution {
    public int subarraysDivByK(int[] A, int K) {
        // int count=0;
        int sum[] = new int[A.length+1];
        sum[0] = 0;
        for(int i=1;i<sum.length;i++)
            sum[i] = sum[i-1] + A[i-1];
        int[] count = new int[K];
        for(int k:sum)
            count[(k%K+K)%K]++;
        int ans = 0;
        for(int i : count)
            ans += i*(i-1)/2;
        return ans;
    }
}