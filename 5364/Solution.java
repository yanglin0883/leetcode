class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] res = new int[len];
        // Arrays.fill(res, -1);
        for(int i=0;i<len;i++){
            for(int j=len-1;j>index[i];j--) res[j] = res[j-1];
            res[index[i]] = nums[i];
        }
        
        return res;
    }
}