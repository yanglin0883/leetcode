class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        List<int[]> ch = new ArrayList();
        int i=0, j=0, mod = 1000000007;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ch.add(new int[]{i, j});
                i++;j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else j++;
        }
        long dp1[] = new long[nums1.length];
        long dp2[] = new long[nums2.length];
        i=0;
        j=0;
        for(int[]k: ch){
            for(;i<=k[0];i++){
                if(i>0)dp1[i] = dp1[i-1]+nums1[i];
                else dp1[i] = nums1[i];
            }
            for(;j<=k[1];j++){
                if(j>0)dp2[j] = dp2[j-1]+nums2[j];
                else dp2[j] = nums2[j];
            }
            long temp = Math.max(dp1[i-1], dp2[j-1]);
            dp1[i-1] = temp;
            dp2[j-1] = temp;
        }
        for(;i<dp1.length;i++){            
                if(i>0)dp1[i] = dp1[i-1]+nums1[i];
                else dp1[i] = nums1[i];
        }
        for(;j<dp2.length;j++){
            if(j>0)dp2[j] = dp2[j-1]+nums2[j];
            else dp2[j] = nums2[j];
        }
        return (int)(Math.max(dp1[dp1.length-1], dp2[dp2.length-1]) % mod);
    }
}