class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList();
        if(nums==null||nums.length<4) return res;
        Arrays.sort(nums);
        for(int a=0;a<nums.length;a++){
            if(a>0 && nums[a]==nums[a-1]) continue;
            for(int b=a+1;b<nums.length;b++){
                if(b>a+1 && nums[b]==nums[b-1])continue;
                int left = b+1, right = nums.length-1;
                while(left<right){
                    int sum = nums[left]+nums[right]+nums[a]+nums[b];
                    if(sum==target){
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[a]); temp.add(nums[b]); temp.add(nums[left]); temp.add(nums[right]);
                        res.add(temp);
                        
                        left++; right--;
                        while(left<right &&nums[left]==nums[left-1]) left++;
                        while(left<right && nums[right]==nums[right+1]) right--;
                    }
                    else if(sum<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}