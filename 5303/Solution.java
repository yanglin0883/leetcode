class Solution {
    public String freqAlphabets(String s) {
        char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>-1;i--){
            if(str[i]=='#'){
                int n = str[i-1]-'0'+10*(str[i-2]-'0');
                sb.append((char)('a'+n-1));
                i-=2;
            }
            else {
                sb.append((char)(str[i]-'1'+'a'));
            }
        }
        sb.reverse();
        return sb.toString();                          
    }
}