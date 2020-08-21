class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int max=0, temp=0;
        Map<Integer,Integer> values = new HashMap();
        values.put(0,-1);
        for(int i=0;i<nums.length;i++){
            temp += (nums[i]==1)?1:-1;
            if(values.containsKey(temp)){
                max = Math.max(max,i-values.get(temp));
            }else values.put(temp, i);
        }
        return max;
    }
}