class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums.length==0) return res;
        int[] flag = new int[nums.length+1];
        for(int i:nums){
            flag[i]++;
        }
        for(int i=1;i<flag.length;i++)
            if(flag[i]==2) res.add(i);
        return res;
    }
}