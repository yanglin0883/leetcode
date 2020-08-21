class Solution {
    public int findMin(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    int helper(int n[],int l, int r){
        if(l+1>=r) return Math.min(n[l], n[r]);
        if(n[l]<n[r])return n[l];
        int m=l+(r-l>>1);
        return Math.min(helper(n, l, m), helper(n, m+1, r));
    }
}