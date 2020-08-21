class Solution {
    public boolean hasAlternatingBits(int n) {
        if((n&1)==0)n>>=1;
        while(n>0){
            if((n&3) != 1) return false;
            n>>=2;
        }
        return true;
    }
}