class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i: nums)
            hm.put(i, hm.getOrDefault(i, 0)+1);
        int max=0;
        for(int i : hm.keySet()){
            if(hm.containsKey(i+1))max = Math.max(max, hm.get(i)+hm.get(i+1));
            //System.out.println(i+"  "+hm.get(i)+"  "+max+"  "+hm.getOrDefault(i,0));
        }
        return max;
    }
}