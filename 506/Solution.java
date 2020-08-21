class Solution {
    public String[] findRelativeRanks(int[] nums) {
        if(nums==null || nums.length==0) return new String[0];
        String[] res  =new String[nums.length];
        if(nums.length==1){res[0] = "Gold Medal"; return res;}
        if(nums.length==2){
            if(nums[0]>nums[1])
            {res[0] = "Gold Medal";res[1] = "Silver Medal";} 
            else{res[1] = "Gold Medal";res[0] = "Silver Medal";}
            return res;}
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Map<Integer, String> hm = new HashMap<>();
        int j=nums.length;
        for(int i=0;i<nums.length;i++){
            heap.offer(nums[i]);
        }
        for(int i=nums.length;i>3;i--){
            hm.put(heap.poll(), Integer.toString(j--));
        }
        hm.put(heap.poll(),"Bronze Medal");
        hm.put(heap.poll(),"Silver Medal");
        hm.put(heap.poll(), "Gold Medal");
        //Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
                res[i] = hm.get(nums[i]);            
        }
        return res;
    }
}