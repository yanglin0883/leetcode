class Solution {
    public int countPrimes(int n) {
        if(--n<2)return 0;
        boolean[] nums = new boolean[n+1];
        int sq = (int)Math.sqrt(n);
        for(int i=2;i<=sq;i++){
            if(nums[i]) continue;
            int temp = n/i;
            for(int j=2;j<=temp;j++)
                nums[j*i] = true;
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(!nums[i]) count++;
        }
        return count;
    }
}