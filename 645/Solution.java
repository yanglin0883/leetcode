class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        boolean[] flag = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(flag[nums[i]]) res[0] = nums[i];
            else flag[nums[i]] = true;
        }
        for(int i=1;i<flag.length;i++)
            if(!flag[i]){
                res[1] = i;
                break;
            }
        return res;
    }
}