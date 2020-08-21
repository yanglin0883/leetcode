class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], 2);
            }
            else
                hm.put(nums[i], 1);
        }
        for(Integer i: hm.keySet()){
            if(hm.get(i)==1) return i;
        }
        return -1;
    }
}