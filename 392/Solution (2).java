class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null || s.length()==0) return true;
        if(t==null || t.length()<s.length()) return false;
        int j=0;
        for(int i=0;i<s.length();i++){
            j=t.indexOf(s.charAt(i),j);
            if(j==-1) return false;
            j++;
        }
        return true;
    }
}