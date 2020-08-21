class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0, slow=0;
       // boolean flag = true;
        for(;fast<nums.length;fast++){
            if(nums[fast]!=0)nums[slow++] = nums[fast];
        }
        for(;slow<nums.length;slow++){
            nums[slow] = 0;
        }
    }
}