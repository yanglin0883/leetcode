class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        dfs(s, 0, wordDict);
        return res;
    }
    boolean res=false;
    void dfs(String s, int start, List<String> dic){
        if(start==s.length())res = true;
        if(res) return;
        for(String i:dic){
            int len = i.length();
            if(res||start+len > s.length())continue;
            if(s.substring(start, start+len).equals(i)){
                dfs(s, start+len, dic);
            }
        }
    }
}