class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
            min = Math.min(min, nums[i]);
        int total=0;
        for(int i=0;i<nums.length;i++)
            total += nums[i] - min;
        return total;
    }
}