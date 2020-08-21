class Solution {
    public int majorityElement(int[] nums) {
        int ele=nums[0];
        int amount =1;
        for(int i=1;i<nums.length;i++){
            if(amount==0){
                ele = nums[i];
                amount++;
            }
            else if(ele==nums[i]){
                amount++;
            }
            else amount--;
        }
        return ele;
    }
}