class Solution {
    public int maxVowels(String s, int k) {
        int v=0;
        for(int i=0;i<k;i++){
            if(isV(s.charAt(i))) v++;
        }
        int max = v;
        for(int i=0;i+k<s.length();i++){
            if(isV(s.charAt(i))) v--;
            if(isV(s.charAt(i+k))) v++;
            max = Math.max(max, v);
        }
        return max;
    }
    boolean isV(char c){
        return c=='a' || c=='e' || c=='i' || c=='o'|| c=='u';
    }
}