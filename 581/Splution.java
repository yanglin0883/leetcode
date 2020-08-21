class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] n = Arrays.copyOf(nums, nums.length);
        Arrays.sort(n);
        int left=0;
        int right=n.length-1;
        for(;left<n.length;left++)
            if(nums[left]!=n[left]) break;
        
        for(;right>-1;right--)
            if(nums[right]!=n[right]) break;
        if(left>=right) return 0;
        return right-left+1;
    }
}