class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length;
        int slow=0;
        boolean twice=false;
        for(int i=1;i<nums.length;i++){
            if(nums[slow]!=nums[i]){
                nums[++slow] = nums[i];
                twice = false;
            }
            else if(!twice){
                nums[++slow] = nums[i];
                twice = true;
            }
        }
        return slow+1;
    }
}