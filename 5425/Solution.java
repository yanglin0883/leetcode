class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        return (int)(max(h, horizontalCuts)*max(w, verticalCuts)%mod);
    }
    long mod = 1000000007;
    long max(int len, int[] cuts){
        int edge=0;
        Arrays.sort(cuts);
        int max = Math.max(cuts[0]-edge,len-cuts[cuts.length-1]);
        for(int i=0;i<cuts.length;i++){
            max = Math.max(max, cuts[i] - edge);
            edge = cuts[i];
        }
        return max%mod;
    }
}