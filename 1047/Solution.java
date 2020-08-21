class Solution {
    public String removeDuplicates(String S) {
        StringBuilder res = new StringBuilder();
        for(char c: S.toCharArray()){
            if(res.length()==0||res.charAt(res.length()-1)!=c) res.append(c);
            else res.deleteCharAt(res.length()-1);
        }
        return res.toString();
    }
}