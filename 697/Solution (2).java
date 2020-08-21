class Solution {
    public int findShortestSubArray(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        HashMap<Integer, int[]> map = new HashMap<>();
        int minLen =1, maxFre = 0;
        // Record [start,freq] for all nums and maxFreq
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                int val[] = {i,1};
                map.put(nums[i], val);
            }
            else{
                int[] val = map.get(nums[i]);
                val[1]++;
                if(val[1]>maxFre){
                    minLen = i-val[0]+1;
                    maxFre = val[1];
                }
                else if(val[1]==maxFre)
                    minLen = Math.min(minLen, i-val[0]+1);
            }
        }
        return minLen;
    }
}