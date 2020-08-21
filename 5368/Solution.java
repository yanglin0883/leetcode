class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for(int i: arr)
            map.put(i, map.getOrDefault(i, 0)+1);
        int res=-1;
        for(int i: map.keySet()){
            if(i==map.get(i) && i>res) res = i;
        }
        return res;
    }
}