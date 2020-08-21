class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i++){
            res[indices[i]] = str[i];
        }
        return new String(res);
    }
}