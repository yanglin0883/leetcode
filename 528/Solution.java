class Solution {

    public Solution(int[] w) {
        sum = new int[w.length];
        sum[0] = w[0];
        for(int i=1;i<w.length;i++){
            sum[i] = sum[i-1] + w[i];
        }
    }
    int[] sum;
    Random r = new Random();
    public int pickIndex() {
        double t = r.nextDouble() * (double)sum[sum.length-1];
        for(int i=0;i<sum.length;i++){
            if(sum[i]>t) return i;
        }
        return sum.length-1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */