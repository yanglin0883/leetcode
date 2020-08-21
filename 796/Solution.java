class Solution {
    public boolean rotateString(String A, String B) {
        if(A==null&&B==null) return true;
        if(A==null||B==null) return false;
        if(A.length()!=B.length()) return false;
        int n = A.length();
        if(n==0) return true;
        if(n==1) return A.equals(B);
        String AA = A+A;
        T:for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(AA.charAt(i+j)!=B.charAt(j)){
                    if(j!=0)i=i+j-1;
                    continue T;
                }
            }
            return true;
        }
        return false;
    }
}