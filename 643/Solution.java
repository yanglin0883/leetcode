class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max, temp =0.0;
        for(int i=0;i<k;i++)
            temp = temp + nums[i];
        temp = temp / k;
        max = temp;
        for(int i=k;i<nums.length;i++){
            temp = temp + (double)(nums[i] - nums[i-k]) / k;
            max = Math.max(max, temp);
        }
        return max;
    }
}