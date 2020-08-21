class Solution {
    public int minDistance(String word1, String word2) {
        memo = new int[word1.length()][word2.length()];
        return dfs(word1, word2, 0, 0);
    }
    int memo[][];
    int dfs(String word1, String word2, int i, int j){
        if(i>=word1.length()&&j>=word2.length()) return 0;
        else if(i>=word1.length()) return word2.length()-j;
        else if(j>=word2.length()) return word1.length()-i;
        if(memo[i][j]!=0) return memo[i][j];
        if(word1.charAt(i)!=word2.charAt(j)){
            memo[i][j] = 1+Math.min(dfs(word1, word2, i+1, j), 
                                     Math.min(dfs(word1, word2, i, j+1),dfs(word1, word2, i+1, j+1)));
            return memo[i][j];
        }
        else{
            memo[i][j] = dfs(word1, word2, i+1, j+1);
            return memo[i][j];
        }
    }
}