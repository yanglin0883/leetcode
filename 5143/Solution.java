class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++)
                res.add(nums[i+1]);
        }
        int[] r = new int[res.size()];
        for(int i=0;i<r.length;i++)
            r[i] = res.get(i);
        return r;
    }
}