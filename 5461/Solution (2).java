class Solution {
    public int numSub(String s) {
        String[] str =s.split("0");
        long res=0, mod = 1000000007;
        for(String i: str){
            long n=i.length();
            res =  res + n*(n+1)/2;
            res %= mod;
        }
        return (int)res;
    }
}