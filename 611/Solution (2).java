class Solution {
    public int triangleNumber(int[] nums) {
        if(nums==null||nums.length<3) return 0;
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==0)continue;
            int j=i+1;
            for(int k=i+2;k<nums.length;k++){
                while(nums[j]<=nums[k]-nums[i]) j++;
                count+= k-j;
            }
        }
        return count;
    }
}