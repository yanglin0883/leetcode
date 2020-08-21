class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i: nums){
            sum+= helper(i);
        }
        return sum;
    }
    int helper(int n){
        int count=1, sq = (int)Math.sqrt(n), sum=0;
        if(sq*sq==n) return 0;
        for(int i=2;i<=sq;i++){
            if(n%i==0){
                count++;
                sum=i;
                if(count>2) return 0;
            } 
            
        }
        if(count!=2) return 0;
        return 1+n+sum+n/sum;
    }
}