class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int M = str1.length(), N = str2.length();
        if(M==0||N==0) return "";
        return str1.substring(0, gcd(M, N));
    }
    private int gcd(int a, int b){
        if(a<b) return gcd(b, a);
        else if(a%b==0) return b;
        else return gcd(b, a%b);
    }
}