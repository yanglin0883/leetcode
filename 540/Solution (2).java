class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<r){
            int m = l+(r-l>>1);
            if((m&1)==1) m--;
            if(nums[m]==nums[m+1]) l = m+2;
            else r = m;
        }
        return nums[l];
    }
}