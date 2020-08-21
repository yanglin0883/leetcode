class Solution {
    public int numTrees(int n) {
        // if(n<1) return 1;
        if(n<=1) return 1;
        int res=0;
        int a, b;
        for(int i=0;i<n;i++){
            a=numTrees(i-0);
            b=numTrees(n-i-1);
            res += a * b;
        }
        return res;
    }
}