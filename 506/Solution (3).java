class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int len=nums.length;
        int[][] n = new int[len][2];
        for(int i=0;i<len;i++){
            n[i][1] =i;
            n[i][0] =nums[i];
        }
        Arrays.sort(n, (p1, p2)->p2[0]-p1[0]);
        String[] res = new String[len];
        for(int i=0;i<len;i++){
            switch(i){
                case 0: res[n[i][1]] = "Gold Medal";break;
                case 1: res[n[i][1]] = "Silver Medal";break;
                case 2: res[n[i][1]] = "Bronze Medal";break;
                default: res[n[i][1]] = Integer.toString(i+1);
            }
        }
        return res;
    }
}