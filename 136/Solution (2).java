class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        HashMap<Integer, Integer> hm  = new HashMap();
        for(int i:nums)
        {
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }   
        for(Integer i: hm.keySet()){
            if(hm.get(i)==1) return i.intValue();
        }
        return res;
    }
}