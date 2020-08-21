class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int j=i+1;
                for(;j<nums.length;j++) if(nums[j]==1) break;
                if(j==nums.length) return true;
                if(j-i-1<k) return false;
                i = j-1;
            }
        }
        return true;
    }
}