class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(n<0) return myPow(1/x, -(n+1))/x;
        if(n%2==1) return x*(myPow(x*x, (n-1)/2));
        else {
            if(n==0) return 1;
            else return myPow(x*x, n/2);
        }
    }
}