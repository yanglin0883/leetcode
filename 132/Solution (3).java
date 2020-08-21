class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] minCuts = new int[n];
        Arrays.fill(minCuts, Integer.MAX_VALUE);
        minCuts[0]=0;
        boolean[][] isPalin = new boolean[n][n];
        for(int i=1;i<n;i++)
            for(int j=0;j<=i;j++)
                if(s.charAt(j)==s.charAt(i) && (j+1>=i-1 || isPalin[j+1][i-1])){
                    isPalin[j][i] = true;
                    if(j==0) minCuts[i]=0;
                    else minCuts[i] = Math.min(minCuts[i], minCuts[j-1]+1);
                }
        return minCuts[n-1];
    }
}