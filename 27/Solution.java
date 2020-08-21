class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = nums.length-1;
        if(left==right){
            if(nums[0]==val) return 0;
            else return 1;
        }
        int res =0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==val) res++;
        while(left<right){
            while(left<right&&nums[left]!=val) left++;
            while(left<right&&nums[right]==val) right--;
            if(left<right) nums[left++] = nums[right--];
        }
        return nums.length-res;
    }
}