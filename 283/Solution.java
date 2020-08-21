class Solution {
    public void moveZeroes(int[] nums) {
        int fast=0, slow=0;
       // boolean flag = true;
        while(fast<nums.length){
            while(fast<nums.length&&nums[fast]==0) {fast++;}
            if(fast<nums.length){nums[slow] = nums[fast];}
            slow++;
            fast++;
            System.out.println(slow+" :: "+fast);
        }
        if(nums[nums.length-1]==0) slow--;
        for(;slow<nums.length;slow++){
            nums[slow] = 0;
        }
    }
}