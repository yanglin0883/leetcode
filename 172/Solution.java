class Solution {
    public int trailingZeroes(int n) {
        if(n<0) return -1;
        int ans=0;
        while(n>=5){
            n/=5;
            ans+=n;
        }
        return ans;
    }
}