class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] jump = new int[n+1];
        for(int i=0;i<ranges.length;i++){
            if(ranges[i]==0) continue;
            int index = Math.max(0, i-ranges[i]);
            int value = Math.min(n, i+ranges[i]);
            value = value-index;
            jump[index] = Math.max(jump[index], value);
        // for(int j:jump) System.out.print(j+"  ");
        // System.out.println();
        }
        int res =jump(jump);
        if(res == Integer.MAX_VALUE||res<0) return -1;
        else return res;        
    }
    
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int pos = 0; pos < nums.length-1; pos++) {
            for (int jump = 0; jump <= nums[pos]; jump++) {
                if (pos+jump >= nums.length) break;
                if (dp[pos+jump] > dp[pos]+1)
                    dp[pos+jump] = dp[pos]+1;
            }
        }
        return dp[nums.length-1];
    }
}