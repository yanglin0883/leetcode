class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null||s.length()<2) return false;
        int n = s.length();
        T1:for(int i=1;i<=n/2;i++){
            if(n%i!=0) continue;
            //s1=s.substring(0,i);
            for(int j=0;j<n;j+=i){
                for(int a=0;a<i;a++){
                    if(s.charAt(a+j)!=s.charAt(a)) continue T1;
                }
            }
            return true;
        }
        return false;
    }
}