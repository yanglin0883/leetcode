class Solution {
    public int firstUniqChar(String s) {
        char[] str = s.toCharArray();
        t1:for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(i==j)continue;
                if(str[i]==str[j]) continue t1;
            }
            return i;
        }
        return -1;
    }
}