class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int[] leftSum = new int[nums.length];
        leftSum[0] = nums[0];
        for(int i=1;i<nums.length;i++)
            leftSum[i] = leftSum[i-1] + nums[i];
        int[] rightSum = new int[nums.length];
        rightSum[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>-1;i--)
            rightSum[i] = rightSum[i+1] + nums[i];
        for(int i=0;i<leftSum.length;i++)
            if(leftSum[i]==rightSum[i]) return i;
        return -1;
    }
}