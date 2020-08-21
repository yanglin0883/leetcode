class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int res = m;
        for(int i=m+1;i<=n;i++)
            res = res&i;
        return res;
    }
}