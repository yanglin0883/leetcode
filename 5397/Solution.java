class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList();
        if(n==1) return res;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(gcd(i,j)!=1) continue;
                res.add(j+"/"+i);
            }
        }
        return res;
    }
    int gcd(int a, int b){
        while(b!=0){
            int t = b;
            b = a%b;
            a= t;
        }
        return a;
    }
}