class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList();
        if(s.length()<p.length()) return res;
        int[] l = new int[26];
        for(char c: p.toCharArray()){
            l[c-'a']++;
        }
        int[] cur = new int[26];
        char[] str = s.toCharArray();
        for(int i=0;i<p.length();i++){
            cur[str[i]-'a']++;
        }
        if(same(cur, l)) res.add(0);
        for(int i=p.length();i<str.length;i++){
            cur[str[i]-'a']++;
            cur[str[i-p.length()]-'a']--;
            if(same(cur, l)) res.add(i-p.length()+1);
        }
        return res;
    }
    boolean same(int[]a, int[]b){
        for(int i=0;i<26;i++)
            if(a[i]!=b[i]) return false;
        return true;
    }
}