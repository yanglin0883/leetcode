class Solution {
    public int numPrimeArrangements(int n) {
        int count=0;
        T:for(int i=2;i<=n;i++){
            int s = (int)Math.sqrt(i);
        //System.out.println(count+" "+s);
            for(int j=2;j<=s;j++)
                if(i%j==0) continue T;
            count++;
        }
        System.out.println(count);
        long res = f(n-count) * f(count);
        return (int)(res%(1000000007));
    }
    long f(int n){
        long res = 1;
        for(long i=2;i<=n;i++)
            res=res*i%(long)(1000000007);
        return res;
    }
}