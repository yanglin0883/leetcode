class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++)
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],2);
            else
                hm.put(nums[i],1);
        int[] res = new int[2];
        int in =0;
        for(Integer i: hm.keySet()){
            if(hm.get(i)==1) res[in++] = i;
        }
        return res;
    }
}