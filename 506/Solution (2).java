class Solution {
    public String[] findRelativeRanks(int[] nums) {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        for(int i=0;i<nums.length;i++) tm.put(nums[i], "");
        int j=0;
        for(Integer i : tm.keySet()){
            switch(++j){
                case 1: tm.put(i, "Gold Medal"); break;
                case 2: tm.put(i, "Silver Medal"); break;
                case 3: tm.put(i, "Bronze Medal"); break;
                default: tm.put(i, Integer.toString(j));
            }
        }
        String[] res = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = tm.get(nums[i]);
        }
        return res;
    }
}