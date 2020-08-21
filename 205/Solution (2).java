class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        for(int i=0;i<s.length();i++){
            char t1 = s.charAt(i), t2=t.charAt(i);
            if(m1[t1] != m2[t2]) return false;
            m1[t1] = i+1;
            m2[t2] = i+1;
        }
        return true;
    }
}