class Solution {
    public double getProbability(int[] balls) {
        for(int i:balls)n += i;
        k = balls.length;
        this.balls = balls;
        fact[0]=1.0;
        for(int i=1;i<fact.length;++i) fact[i] = fact[i-1] * i;
        dfs(0,0,0,0,0,1.0,1.0);
        return valid / total;
    }
    int n, k;
    int[] balls;
    double total=0.0, valid=0.0;
    double[]fact = new double[50];
    void dfs(int d, int b1, int b2, int c1, int c2, double p1, double p2){
        if(b1>n/2 || b2>n/2) return;
        if(d==k){
            double count = fact[b1]/p1 * fact[b2] / p2;
            total += count;
            if(c1==c2) valid += count;
            return;
        }
        for(int s1=0;s1 <= balls[d];s1++){
            int s2 = balls[d] - s1;
            dfs(d+1, b1+s1, b2+s2, c1+((s1>0)?1:0), c2+((s2>0)?1:0), p1*fact[s1], p2*fact[s2]);
        
        }
    }
}