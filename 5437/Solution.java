class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> hm = new HashMap();
        for(int i:arr)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList(hm.entrySet());
        Collections.sort(al, (a, b)->{
            return a.getValue() - b.getValue();
        });
        for(int i=0;i<al.size();i++){
            k-=al.get(i).getValue();
            if(k==0) return al.size()-i-1;
            if(k<0) return al.size()-i;
        }
        return 0;
    }
}