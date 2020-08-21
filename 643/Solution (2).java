class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max, temp =0;
        for(int i=0;i<k;i++)
            temp += nums[i];
        max = temp;
        for(int i=k;i<nums.length;i++){
            temp +=(nums[i] - nums[i-k]);
            max = Math.max(max, temp);
        }
        return (double)max/k;
    }
}