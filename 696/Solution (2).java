class Solution {
    public int countBinarySubstrings(String s) {
        int pre=0, cur=0, res=0;
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(i==0 || c[i] == c[i-1]) cur++;
            else {
                pre  = cur;
                cur=1;
            }
            if(pre>=cur) res++;
        }
        return res;
    }
}