class Solution {
    public int bitwiseComplement(int N) {
        if(N==0) return 1;
        int res =0, i=0;
        while(N>0){            
            res+=((N&1)^1)<<i++;
            N>>=1;
        }
        return res;
    }
}