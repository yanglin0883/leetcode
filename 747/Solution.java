class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;
        int max=0, secondMax=1;
        if(nums[0]<nums[1]){
            max = 1;
            secondMax =0;
        }
        for(int i=2;i<nums.length;i++){
            if(nums[i]>nums[secondMax])
                secondMax = i;
            if(nums[secondMax]> nums[max]){
                int temp = max;
                max = secondMax;
                secondMax = temp;
            }
        }
        if(nums[max] >= nums[secondMax] * 2) return max;
        else return -1;
    }
}