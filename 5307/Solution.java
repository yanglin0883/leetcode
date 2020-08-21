class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] res = {0,0};
        for(int i=1;i<=n/2;i++){
            if(noZero(i)&&noZero(n-i)){
                res[0] = i;
                res[1] = n-i;
                return res;
            }
        }
        return res;
    }
    boolean noZero(int n){
        if(n<10) return true;
        while(n>0){
            if(n%10==0) return false;
            n/=10;
        }
        return true;
    }
}