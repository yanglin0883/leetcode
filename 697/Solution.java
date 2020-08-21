class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        Set<Integer> key = hm.keySet();
        int max =0 ;
        for(Integer i: key)
            max = Math.max(max, hm.get(i));
        ArrayList<Integer> sameDegree = new ArrayList<>();
        for(Integer i: key){
            if(max== hm.get(i)) sameDegree.add(i);
        }
        // System.out.println(key);
        // System.out.println(max);
        // System.out.println(sameDegree);
        int min=nums.length;
        for(Integer i: sameDegree){
            int left=0, right=0;
            for(int j=0;j<nums.length;j++)
                if(nums[j]==i){
                    left = j;
                    break;
                }
            for(int j=nums.length-1;j>-1;j--)
                if(nums[j]==i){
                    right = j;
                    break;
                }
            //System.out.println(left+"  "+right);
            min = Math.min(min, right-left+1);
        }
        return min;
    }
}