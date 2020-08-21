class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(!isGood(sb)) tidy(sb);
        return sb.toString();
    }
    boolean isGood(StringBuilder sb){
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)+'A'-'a' || sb.charAt(i)==sb.charAt(i+1)+'a'-'A') return false;
        }
        return true;
    }
    void tidy(StringBuilder sb){
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1)+'A'-'a' || sb.charAt(i)==sb.charAt(i+1)+'a'-'A') {
                // System.out.println(i+"  + "+sb.toString());
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                // i--;
            }
        }
    }
}