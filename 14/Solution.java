class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        // StringBuilder res = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            char temp = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<=i||temp!=strs[j].charAt(i)) return strs[0].substring(0,i);
            }
            //res.append(temp);
        }
        return strs[0];
    }
}