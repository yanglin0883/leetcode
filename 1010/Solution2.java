class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int c[] = new int[60];
        for(int i:time)
            c[i%60]++;
        int res = (c[0]*(c[0]-1)+c[30]*(c[30]-1))/2;
        for(int i=1;i<30;i++)
            res += c[i] * c[60-i];
        return res;
    }
}