class Solution {
    public int strStr(String haystack, String needle) {
        if(needle==null|| needle.length()==0) return 0;
        if(haystack==null||haystack.length()==0) return -1;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        T1:for(int i=0;i<h.length;i++){
            for(int j=0;j<n.length;j++){
                if(i+j>=h.length) return -1;
                if(n[j]!=h[i+j]) continue T1;
            }
            return i;
        }
        return -1;
    }
}