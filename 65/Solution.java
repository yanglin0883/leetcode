class Solution {
    public boolean isNumber(String s) {
        s= s.trim();
        if(s==null||s.length()==0) return false;
        s = ignoreSign(s);
        int index = s.indexOf('e');
        if(index==0 || index==s.length()-1) return false;
        if(index==-1) return isValid(s);
        else{
            return isValid(s.substring(0,index)) && 
                isInteger(ignoreSign(s.substring(index+1, s.length())));
        }
        
    }
    boolean isInteger(String n){
        // System.out.println("isInteger runs: "+n);
        if(n.length()==0) return false;
        // if(n.charAt(0)=='-'||n.charAt(0)=='+') n = n.substring(1, n.length());
        if(n.length()==0) return false;
        char[] str = n.toCharArray();
        
        for(int i=0;i<str.length;i++){
            if(str[i]<'0'||str[i]>'9') {
                // System.out.println(i+"th out");
                return false;
            }
        }
        // System.out.println("isInteger returns true");
        return true;
    }
    boolean isValid(String n){
        // System.out.println("isValid runs: "+n);
        int index = n.indexOf('.');
        if(index==-1) return isInteger(n);
        else if(index==n.length()-1) return isInteger(n.substring(0, n.length()-1));
        else {
            // char temp = n.charAt(index+1);
            // if(temp=='-' || temp=='+') return false;
            if(index==0) return isInteger(n.substring(1, n.length()));
            return isInteger(n.substring(0,index)) && isInteger(n.substring(index+1, n.length()));
        }
    }
    String ignoreSign(String s){
        if(s.charAt(0)=='-' || s.charAt(0)=='+') return s.substring(1, s.length());
        return s;
    }
}