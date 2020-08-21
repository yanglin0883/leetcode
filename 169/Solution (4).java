class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length/2;
        Map<Integer, Integer>map = new HashMap();
        for(int i:nums)map.put(i, map.getOrDefault(i,0)+1);
        for(int i:map.keySet()) if(map.get(i)>len) return i;
        return -1;
    }
}