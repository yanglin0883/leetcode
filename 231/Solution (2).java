class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        do{
            if(n==1) return true;
            if((n&1)==1) break;
            n >>=1;
        }while(true);
        return false;
    }
}