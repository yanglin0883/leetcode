class Solution {
    public String shortestPalindrome(String s) {
        if(s==null||s.length()<2) return s;
        int start = (s.length()+1)/2-1;
        for(int i=start;i>=0;i--){
            // System.out.println(i+"  "+ (i+1));
            if(i!=start && isP(s, i, i+1)) return buildUp(s, i+1, true);
            // System.out.println(i+"  "+ i);
            if(isP(s, i, i)) return buildUp(s, i, false);
        }
        
        
        return s;
    }
    
    boolean isP(String str, int left, int right){
        while(left>=0 && right<str.length()){
            
            if(str.charAt(left--)!=str.charAt(right++)) return false;
        }
        return true;
    }
    String buildUp(String s, int start, boolean isEven){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=start;i--)
            sb.append(s.charAt(i));
        if(isEven) sb.append(s.charAt(start));
        for(int i=start+1;i<s.length();i++)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}