class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(count(nums[i])%2==0) count++;
        return count;
    }
    int count(int n){
        int res=0;
        while(n>0){
            n /=10;
            res++;
        }
        return res;
    }
}