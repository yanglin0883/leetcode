class Solution {
    public boolean backspaceCompare(String S, String T) {
        return tidy(S).equals(tidy(T));
    }
    
    private String tidy(String s){
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='#'){
                if(res.length()>0)
                    res.deleteCharAt(res.length()-1);
            }
            else
                res.append(c);
        }
        return res.toString();
    }
}