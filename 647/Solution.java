class Solution {
    public int countSubstrings(String s) {
        if(s==null||s.length()==0) return 0;        
        char str[] = s.toCharArray();
        int count=str.length;
        for(int i=0;i<str.length;i++){
            count += numOfPalin(str, i-1, i+1) +numOfPalin(str, i, i+1);
        }
        return count;
    }
    private int numOfPalin(char[] str, int left, int right){
        if(left<0||right>=str.length) return 0;
        int res=0;
        while(left>-1&&right<str.length){
            if(str[left--]==str[right++]) res++;
            else break;
        }
        return res;
    }
}