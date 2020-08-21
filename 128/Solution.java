class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2) return nums.length;
        int max=1;
        Set<Integer> set = new HashSet();
        for(int i: nums) set.add(i);
        for(int i: set){
            if(!set.contains(i-1)){
                int length=1;
                while(set.contains(++i)){
                    length++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }
}