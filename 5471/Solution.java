class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        Set<Integer> set = new HashSet();
        set.add(0);
        int ans=0, sum=0;
        for(int i: nums){
            sum += i;
            if(set.contains(sum-target)){
                ans++;
                set.clear();
            }
            set.add(sum);
        }
        return ans;
    }
}