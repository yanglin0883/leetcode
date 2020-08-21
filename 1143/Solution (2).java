class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        memo = new int[s1.length][s2.length];
        for(int i=0;i<memo.length;i++)Arrays.fill(memo[i], -1);
        return dfs(s1, 0, s2, 0);
    }
    
    int[][] memo;
    int dfs(char[] s1, int index1, char[]s2, int index2){
        if(index1>=s1.length || index2 >= s2.length){
            return 0 ;
        }
        if(memo[index1][index2] !=-1) return memo[index1][index2];
        int max=0;
        for(int i=index2;i<s2.length;i++){
            if(s1[index1] == s2[i]){
                max = dfs(s1, index1+1, s2, i+1) + 1;
                break;
            }
        }
        max = Math.max(max,dfs(s1, index1+1, s2, index2));
        memo[index1][index2] = max;
        return max;
    }
}