class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k != 0) return false;
        int min = nums[0];
        int max = nums[0];
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        int groups = nums.length/k;
        //System.out.println(hm.keySet()+" "+min);
        for(int i=0;i<groups;i++){
            for(int j=min;j<min+k;j++){
                if(!hm.containsKey(j)) return false;
                int temp = hm.get(j);
                if(temp<1) return false;
                hm.put(j, temp-1);
            }
            for(int j=min;j<=max;j++)
                if(!hm.containsKey(j)) continue;
                else if(hm.get(j)>0){
                    min = j;
                    break;
                }
        }
        return true;
    }
}