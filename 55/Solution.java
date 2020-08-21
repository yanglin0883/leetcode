class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<2) return true;
        T1:for(int i=nums.length-1;i>-1;i--){
            if(nums[i]>0) continue;
            int j=i;
            for(j=i-1;j>-1;j--){
                System.out.println(i+" :: "+j);
                if(nums[j]>i-j){//发现一个坑，可以跳过去的，到起跳位点， 形成kmp
                    i=j;
                    continue T1;
                }
                if(i==nums.length-1 && nums[j]>=i-j){//最后一个格是坑，不需要跳过去，只要跳进去
                    i=j;
                    continue T1;
                }
            }
            if(j==-1) return false;
        }
        return true;
    }
}