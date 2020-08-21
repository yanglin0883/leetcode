class Solution {
    public int findMaximumXOR(int[] nums) {
        if(nums==null|| nums.length==0) return 0;
        int max=nums[0];
        for(int i:nums)max = Math.max(max, i);
        if(max==0) return 0;
        ArrayList<Integer> al = new ArrayList();
        long tar = 2147483648l;
        while((tar&max)==0) tar>>=1;
        for(int i:nums)if((tar&i)!=0) al.add(i);
        int res = -1;
        for(int j:al)for(int i:nums)res = Math.max(res, i^j);
        return res;
    }
}