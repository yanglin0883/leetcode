class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3) return 0;
        Arrays.sort(nums);
        long res = Long.MAX_VALUE/2;//overflow
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            int left=i+1, right=nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[left]+nums[right];
                // System.out.println(nums[i]+"  "+nums[left]+"  "+nums[right]+" sum= "+sum);
                if(sum==target) return target;
                if(Math.abs(target- sum)<Math.abs(target- res)){ res = sum;}
                // System.out.println(res);
                if(sum>target)right--;
                else left++;
            }
        }
        return (int)res;
    }
}