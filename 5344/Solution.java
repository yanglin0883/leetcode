class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int t=0;
            for(int j=0;j<nums.length;j++){
                if(i==j)continue;
                if(nums[j]<nums[i])t++;
            }
            res[i] = t;
        }
        return res;
    }
}