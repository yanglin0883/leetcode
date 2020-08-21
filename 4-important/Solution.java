class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0) 
            return (nums2.length%2==1)?
                    (double)nums2[nums2.length/2]:
                    ((double)nums2[nums2.length/2]+nums2[nums2.length/2-1]) /2.0;
        if(nums2.length==0) 
            return (nums1.length%2==1)?
                    (double)nums1[nums1.length/2]:
                    ((double)nums1[nums1.length/2]+nums1[nums1.length/2-1]) /2.0;
        
        int[] sum = new int[nums1.length+nums2.length];
        if(nums1[nums1.length-1]<nums2[nums2.length-1]){
            int[] temp= nums1;
            nums1=nums2;
            nums2=temp;
        }//last element of nums1 is always bigger
        int i1=0;
        int i2=0;
        int is=0;
        boolean odd = (nums1.length+nums2.length)%2==1 ? true:false;
        int target = (nums1.length+nums2.length)/2;
        while(i2<nums2.length){
            if(nums1[i1]<nums2[i2]){
                sum[is++] = nums1[i1++];
            }
            else{
                sum[is++] = nums2[i2++];
            }
            if(odd&& is==target+1) return (double)sum[is-1];
            if(!odd &&is== target+1) return ((double)sum[is-2]+(double)sum[is-1])/2.0;
        }
        while(i1<nums1.length){
            sum[is++] = nums1[i1++];
            if(odd&& is==target+1) return (double)sum[is-1];
            if(!odd &&is== target+1) return ((double)sum[is-2]+(double)sum[is-1])/2.0;
        }
        if(odd)return (double)sum[target];
        else return ((double)sum[target-1]+(double)sum[target])/2.0;
    }
}