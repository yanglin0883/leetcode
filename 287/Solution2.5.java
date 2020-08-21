class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
            if(!hs.add(nums[i]))
                return nums[i];            
        return -1;
    }
}