class Solution {
    public int triangleNumber(int[] nums) {
        if(nums==null||nums.length<3) return 0;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[k]>=nums[j]+nums[i]) break;
                    if(nums[k]>=nums[j]-nums[i]) count++;
                }
            }
        }
        return count;
    }
}