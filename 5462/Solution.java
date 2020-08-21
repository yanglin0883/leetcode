class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        if(s.length()-k<=1) return s.length()-k;
        int n = s.length();
        int t = n-k;
        res = n;
        List<Character> path = new ArrayList();
        dfs(s, 0, path, t);
        return res;
    }
    int res;
    Map<String, Integer> hm = new HashMap();
    void dfs(String s, int cur, List<Character>path, int t){
        if(path.size()==t){
            String temp = getString(path);
            if(!hm.containsKey(temp)) hm.put(temp, getC(temp));
            res = Math.min(res, hm.get(temp));
            return ;
        }
        if(s.length()-cur + path.size() < t) return;
        for(int i=cur;i<s.length();i++){
            path.add(s.charAt(i));
            dfs(s, i+1, path, t);
            path.remove(path.size()-1);
        }
    }
    
    String getString(List<Character>path){
        char[] res = new char[path.size()];
        for(int i=0;i<res.length;i++)
            res[i] = path.get(i);
        return new String(res);
    }
    
    int getC(String s){
        int pre=0;
        int res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                res++;
                if(i-pre!=1)
                    res += Integer.toString(i-pre).length();  
                pre = i;
            }
        }
        res++;
        if(s.length()-pre!=1)
            res += Integer.toString(s.length()-pre).length();  
        // System.out.println(s+"  "+ res);
        return res;
    }
}