class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i: A){
            if(hm.containsKey(i))
                return i;
            else 
                hm.put(i, 1);
        }
        return -1;
    }
}