class Solution {
    public String longestPrefix(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        int[] v = new int[n];
        int len=0;
        for(int i=1;i<n;++i){
            if(str[i]==str[len]){
                v[i] = ++len;
            }
            else{
                if(len>0) {len = v[len-1];--i;}
                else v[i] = 0;
            }
            // System.out.println(i+" : "+len+"  "+v[i]);
        }
        // for(int i:v)System.out.print(i+"  ");
        return s.substring(0, v[n-1]);
    }
}