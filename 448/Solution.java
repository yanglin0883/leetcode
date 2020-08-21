class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if(nums.length==0) return res;
        int len=nums.length;
        boolean flag[] = new boolean[len+1];
        for(int i: nums){
            flag[i] = true;
        }
        for(int i=1;i<flag.length;i++){
            if(!flag[i]) res.add(i);
        }
        return res;
    }
}