class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null|| strs.length==0) return "";
        StringBuilder sb = new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            if(strs[i].equals("")) return "";
            helper(sb, strs[i]);
        }
        return sb.toString();
    }
    void helper(StringBuilder sb, String target){
        for(int i=0;i<target.length();i++){
            if(i>=sb.length()) return;
            if(sb.charAt(i)!=target.charAt(i)){
                sb.delete(i, sb.length());
                return;
            }
        }
        if(sb.length()>target.length()) sb.delete(target.length(), sb.length());
    }
}