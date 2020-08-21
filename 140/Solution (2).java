class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        List<String >res = dfs(s,   wordDict);
        // System.out.println(res);
        return res;
    }
    Map<String, List<String>> hm = new HashMap();
    List<String> dfs(String s, List<String>wordDict){
        ArrayList<String> d = new ArrayList();
        d.add("");
        if(s.equals(""))return d;
        if(hm.containsKey(s)) return hm.get(s);
        List<String> sub = new ArrayList();
        List<String> whole = new ArrayList();
        for(String i: wordDict){
            if(i.length()<=s.length()&&s.substring(0, i.length()).equals(i)){
                sub = dfs(s.substring(i.length(), s.length()), wordDict);
                // System.out.println(s+"  "+i+"  "+sub);
                for(String ans:sub){
                    if(ans.length()!=0)
                        whole.add(i+" "+ans);
                    else
                        whole.add(i);
                }
            }
        }
        // System.out.println(whole);
        hm.put(s, whole);
        return whole;
    }
}