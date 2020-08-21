class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;
        int t1[] = new int[26];
        for(char c: s1.toCharArray()){
            t1[c-'a']++;
        }
        char[] str = s2.toCharArray();
        int t2[] = new int[26];
        for(int i=0;i<s1.length();i++){
            t2[str[i]-'a']++;
        }
        if(Arrays.equals(t1, t2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            t2[str[i]-'a']++;
            t2[str[i-s1.length()]-'a']--;
            if(Arrays.equals(t1, t2)) return true;
        }
        return false;
    }
}