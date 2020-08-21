class Solution {
    public int longestSubarray(int[] nums) {
        int[]res = new int[nums.length];
        int cur=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)cur=0;
            else cur++;
            res[i] = cur;
        }
        int max =0;
        for(int i=nums.length-1;i>=0;i--){
            if(i>0&&res[i]==0 && res[i-1]>0) cur = res[i-1];
            max = Math.max(max, cur);
            if(res[i]>0&&res[i]<cur) res[i] = cur;
        }
        // System.out.println(Arrays.toString(res));
        for(int i=1;i<nums.length-1;i++){
            if(res[i]==0){
                if(res[i-1]>0 && res[i+1]>0)
                    max = Math.max(max, res[i-1]+res[i+1]);
            }
        }
        // System.out.println(max);
        if(max==nums.length) max--;
        return max;
    }
}