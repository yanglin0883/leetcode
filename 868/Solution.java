class Solution {
    public int binaryGap(int N) {
        int bits[] = new int[32];
        int j=0;
        for(int i=0;i<32;i++){
            if(((N>>i)&1)!=0)
                bits[j++] = i;
        }
        int ans=0;
        j--;
        for(int i=0;i<j;i++)
            ans = Math.max(ans, bits[i+1] - bits[i]);
        return ans;
    }
}