class Solution {
    public void sortColors(int[] nums) {
        int[] col = new int[3];
        for(int i:nums)
            col[i]++;
        int i=0;
        for(i=0;i<col[0];i++)
            nums[i]=0;
        for(;i<col[0]+col[1];i++)
            nums[i]=1;
        for(;i<nums.length;i++)
            nums[i]=2;        
    }
}