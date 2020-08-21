class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> temp = new ArrayList();
        int[] sum = new int[n+1];
        for(int i=1;i<=n;i++)
            sum[i] = sum[i-1]+nums[i-1];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                temp.add(sum[j]-sum[i]);
            }
        }
        Collections.sort(temp);
        int res = 0;
        int mod = 1000000007;
        for(int i=left-1;i<right;i++){
            res = res + temp.get(i);
            if(res>mod) res -= mod;
        }
        return res;
    }
}