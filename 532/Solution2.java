class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        int count =0;
        for(Integer i: hm.keySet()){
            if(k==0){
                if(hm.get(i)>1) count++;
            }
            else if(hm.containsKey(i+k)) count++;
        }
        return count;
    }
}