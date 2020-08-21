class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        int signal = 1;
        long n = numerator, m = denominator;
        if(n<0){
            n = - n;
            signal *= -1;
        }
        if(m<0){
            m = - m;
            signal *= -1;
        }
        if(numerator==0) signal=0;
        if(denominator == 0) return "";
        StringBuilder res = new StringBuilder();
        if(signal<0) res.append('-');
        res.append(n / m);
        if(n % m==0)
            return res.toString();
        res.append('.');
        res.append(fractionPart(n % m, m));
        return res.toString();
    }
    private StringBuilder fractionPart(long a, long b){
        StringBuilder res = new StringBuilder();
        ArrayList<Long> q = new ArrayList<>();
        while(a!=0){
            q.add(a);
            a*=10;
            long i=9;
            for(;i>-1;i--){
                if(i*b<=a)break;
            }
            res.append(i);
            a -= b*i;
            if(q.contains(a)){
                res.insert(q.indexOf(a),'(');
                res.append(')');
                break;
            }
        }
        return res;
    }
}