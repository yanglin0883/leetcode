class Solution {
    public String toLowerCase(String str) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp<='Z'&&temp>='A') res.append((char)(temp+'a'-'A'));
            else res.append(temp);
        }
        return res.toString();
    }
}