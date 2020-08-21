class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for(int i: nums) res ^= i;
        int a=0,p=0;
        while((res &(1<<p)) == 0){
            p++;
        }
        for(int i:nums){
            if((i & (1<<p))!=0)
                a^=i;
        }
        int[] r = {a, res^a};
        return r;
    }
}