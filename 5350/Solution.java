class Solution {
    public int getKth(int lo, int hi, int k) {
        int[][] nums = new int[hi-lo+1][2];
        for(int i=lo;i<=hi;i++){
            nums[i-lo][0] = i;
            nums[i-lo][1] = func(i);
        }
        Arrays.sort(nums, (p1,p2)->{
            if(p1[1]==p2[1]) return p1[0]-p2[0];
            return p1[1]-p2[1];
        });
        return nums[k-1][0];
    }
    int func(int n){
        int step=0;
        while(n!=1){
            if((n&1)==0) n>>=1;
            else n = 3*n+1;
            step++;
        }
        return step;
    }
}