class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    int helper(int nums[], int left, int right){
        if(left==right) return nums[left];
        int mid = (right-left>>1)+left;
        int l = helper(nums, left, mid), r = helper(nums,mid+1, right);
        if(l==r) return l;
        int lc = count(nums, l, left, right), lr=count(nums, r, left, right);
        return lc>lr?l:r;
    }
    int count(int[] nums, int n, int left, int right){
        int res = 0;
        for(int i=left;i<=right;i++)
            if(nums[i]==n)res++;
        return res;
    }
}