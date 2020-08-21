class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        int[] max = new int[1];
        List<Integer> result = new ArrayList();
        helper(nums, 0, result, max);
        return res;
    }
    List<Integer> res = new ArrayList();
    void helper(int[]nums, int start, List<Integer> result, int[]max){
        if(result.size()>max[0]){
            max[0] = result.size();
            res = new ArrayList(result);
        }
        if(start == nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(result.size()==0){
                result.add(nums[i]);
                helper(nums, i+1, result, max);
                result.remove(result.size()-1);
            }else{
                int top = result.get(result.size()-1);
                if(nums[i]%top==0){
                    result.add(nums[i]);
                    helper(nums, i+1, result, max);
                    result.remove(result.size()-1);
                }
            }
        }
    }
}