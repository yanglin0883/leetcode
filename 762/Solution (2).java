class Solution {
    public int countPrimeSetBits(int L, int R) {
        int count=0;
        boolean[] prime = {false, false, true, true, false, true, false, true, false,false, false, true, false, true, false, false, false, true, false, true, false, false, false, true, false, false, false, false, false, true, false, true, false,false};
        for(int i=L;i<=R;i++){
            if(prime[Integer.bitCount(i)]) count++;
        }
        return count;
    }
}