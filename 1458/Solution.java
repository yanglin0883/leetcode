class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int m = nums1.length, n=nums2.length;
        int[][] f= new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                f[i][j] = nums1[i] * nums2[j];
            }
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(i>0) f[i][j] = Math.max(f[i][j], f[i-1][j]);
                if(j>0) f[i][j] = Math.max(f[i][j], f[i][j-1]);
                if(i>0 && j>0) 
                    f[i][j] = Math.max(f[i][j], f[i-1][j-1]+Math.max(0, nums1[i]*nums2[j]));
            }
        return f[m-1][n-1];
    }
}