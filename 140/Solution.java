class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList();
        if(s.length()<=100)dfs(s, 0, res, new ArrayList(), wordDict);
        return res;
    }
    void dfs(String s, int cur, List<String>res, List<String>path, List<String>wordDict){
        if(cur>=s.length()){
            res.add(asOne(path)) ;
            return;
        }
        for(int i=cur+1;i<=s.length();i++){
            String temp = s.substring(cur, i);
            if(wordDict.contains(temp)){
                path.add(temp);
                dfs(s, i, res, path, wordDict);
                path.remove(path.size()-1);
            }
        }
    }
    String asOne(List<String>path){
        StringBuilder sb = new StringBuilder();
        for(String i: path){
            sb.append(i);
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}