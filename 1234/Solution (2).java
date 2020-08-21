class Solution {
    public int balancedString(String s) {
        char[] str = (s+s).toCharArray();
        int data[] = new int[26];
        int n=s.length()/4, l=0, r=-1, cur=0, res=0;
        while(l<str.length){
            if((r+1)<str.length&&data[str[r+1]-'A']<n){
                data[str[++r]-'A'] ++;
                cur++;
            }else {
                data[str[l++]-'A'] --;
                cur--;
            }
            if(!(l>=1&&r<=s.length()-2 || l>=s.length()+1 && r<=str.length-2))
                res = Math.max(res, cur);
        }
        return s.length()-res;
    }
}