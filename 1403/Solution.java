class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList();
        int sum=0;
        for(int i:nums)sum+=i;
        int temp=0;
        for(int i=nums.length-1;i>-1;i--){
            temp+=nums[i];
            res.add(nums[i]);
            if(temp>sum/2) break;
        }
        return res;
    }
}