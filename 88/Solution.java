class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m+n-1;i>=n;i--){
            nums1[i] = nums1[i-n];
        }
        // print(nums1);
        int i=n, j=0, res = 0;
        while(i<m+n&&j<n){
            // System.out.println(i+"  "+j+"  "+res);
            // print(nums1);
            if(nums1[i]<nums2[j]) nums1[res++] = nums1[i++];
            else nums1[res++] = nums2[j++];
        }
        //print(nums1);
        if(i==n+m){
            while(j<n)
                nums1[res++] = nums2[j++];
        }
    }
    void print(int[] n){
        for(int i=0;i<n.length;i++)
            System.out.print(n[i]+"  ");
        System.out.println();
    }
}