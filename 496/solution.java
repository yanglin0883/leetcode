class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        Arrays.fill(res, -1);
        T1:for(int i=0;i<nums1.length;i++)
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == nums1[i]){
                    for(int k=j;k<nums2.length;k++){
                        if(nums2[j]<nums2[k]){
                            res[i] = nums2[k];
                            continue T1;
                        }
                    }
                }
            }
        return res;
    }
}