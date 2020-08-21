class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        int m = nums1.length, n = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1=0, p2=0, index=0;
        int res[] = new int[Math.min(m,n)];
        while(p1<m &&p2<n){
            int v1 = nums1[p1], v2 = nums2[p2];
            if(v1<v2)
                p1++;
            else if(v1>v2)
                p2++;
            else{
                res[index++] = v1;
                p1++;
                p2++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}