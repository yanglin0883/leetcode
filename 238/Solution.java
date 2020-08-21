class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len], right = new int[len], res = new int[len];
        left[0] = nums[0];
        for(int i=1;i<len;i++)
            left[i] = left[i-1]*nums[i];
        right[len-1] = nums[len-1];
        for(int i=len-2;i>-1;i--)
            right[i] = right[i+1]*nums[i];
        //Arrays.fill(res,1);
        for(int i=0;i<len;i++){
            res[i] = ((i>0)? left[i-1]:1) * ((i!=len-1)?right[i+1]:1);
        }
        return res;
    }
}