class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int max = 0;
        for(int i=0;i<s.length;i++){
            int sa=0;
            for(int j=i;j<s.length;j++){
                sa += (j-i+1) * s[j];
            }//if(sa<max) return max;
            max = Math.max(max, sa);
        }
        return max;
    }
}