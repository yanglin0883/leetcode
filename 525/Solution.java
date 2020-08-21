class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int[] left = new int[nums.length+1];        
        for(int i=1;i<left.length;i++){
            if(nums[i-1]==1)
                left[i] = left[i-1]+1;
            else left[i] = left[i-1]-1;
        }
        int max=0;
        // System.out.println(Arrays.toString(left));
        Map<Integer,Integer> values = new HashMap();
        values.put(0,0);
        for(int i=1;i<left.length;i++){
            if(values.containsKey(left[i])){
                // System.out.println(left[i]+"  "+i);
                max = Math.max(max,i-values.get(left[i]));
            }else values.put(left[i], i);
        }
        return max;
    }
}