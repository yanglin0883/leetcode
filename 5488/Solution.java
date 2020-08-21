class Solution {
    public int minOperations(int n) {
        int left = 2*(n/2) -1, right = (n+1)/2*2+1;        
        int res=0;
        for(;left>=1;left-=2){
            res += (right-left)/2;
            right += 2;
        }
        return res;
    }
}