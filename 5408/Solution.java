class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> hm = new HashMap();
        for(int i:target)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        for(int i:arr)
            hm.put(i, hm.getOrDefault(i, 0)-1);
        for(int i: hm.keySet())
            if(hm.get(i)!=0) return false;
        return true;
    }
}