class Solution {
    public boolean isIsomorphic(String sStr, String tStr) {
        char[] s= sStr.toCharArray();
        char[] t = tStr.toCharArray();
        int len = s.length;
        char[] ms = new char[256];
        char[] mt = new char[256];
        for(int i=0;i<len;i++){
            if(ms[s[i]]==0 && mt[t[i]]==0){
                ms[s[i]] = t[i];
                mt[t[i]] = s[i];
            }
            else if(ms[s[i]]!=t[i] || mt[t[i]]!=s[i])
                return false;
        }
        return true;
    }
}