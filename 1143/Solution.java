class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s1 = text1.toCharArray();
        char[] s2 = text2.toCharArray();
        dfs(s1, 0, s2, 0, 0);
        return max;
    }
    int max=0;
    void dfs(char[] s1, int index1, char[]s2, int index2, int lastStep){
        if(index1>=s1.length || index2 >= s2.length){
            max = Math.max(max, lastStep);
            return;
        }
        for(int i=index2;i<s2.length;i++){
            if(s1[index1] == s2[i]){
                dfs(s1, index1+1, s2, i+1, lastStep+1);
                break;
            }
        }
        dfs(s1, index1+1, s2, index2, lastStep);
    }
}