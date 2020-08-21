class Solution {
    public int minStartValue(int[] nums) {
        int sum[] = new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            sum[i] = sum[i-1]+nums[i-1];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<sum.length;i++){
            min = Math.min(min, sum[i]);
        }
        return min>=0 ? 1 : -min+1;
    }
}