class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        int[][]dp = new int[s1.length][s2.length];
        if(s1[0]==s2[0])dp[0][0] =1;        
        for(int i=1;i<s1.length;i++){
            if(dp[i-1][0]==1 || s1[i]==s2[0])dp[i][0] = 1;
        }
        for(int i=1;i<s2.length;i++){
            if(dp[0][i-1]==1 || s1[0]==s2[i])dp[0][i] = 1;
        }
        
        for(int i=1;i<s1.length;i++)
            for(int j=1;j<s2.length;j++){
                if(s1[i]==s2[j]) dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        
        return dp[s1.length-1][s2.length-1];
    }
}