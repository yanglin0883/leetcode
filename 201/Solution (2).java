class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        boolean[] digs = new boolean[32];
        Arrays.fill(digs, true);
        long bit = 2147483648l;
        for(int i=0;i<31;i++){
            bit >>= 1; 
            for(int j=m;j<=n && digs[i];j++){
                digs[i] =  digs[i] && (bit & j)>0;
            }
            // System.out.println(bit +"  "+ digs[i]);
        }
        int res=0;
        bit=1;
        for(int i=30;i>-1;i--){
            if(digs[i])res+=bit;
            bit <<= 1;
        }
        return res;
    }
}