class Solution {
    public int numSplits(String s) {
        int[][] l = new int[26][2];
        for(int[]i:l){Arrays.fill(i, -1);}
        char[] str =s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(l[str[i]-'a'][0]==-1)
                l[str[i]-'a'][0]=i;
        }
        for(int i=str.length-1;i>=0;i--){
            if(l[str[i]-'a'][1]==-1)
                l[str[i]-'a'][1]=i;
        }
        int res=0;
        for(int i=1;i<str.length;i++){
            if(check(l, 0, i) == check(l, i, str.length))res++;
        }
        return res;
    }
    int check(int[][]l, int s, int e){
        int res=0;
        for(int[]i:l){
            if(i[0]>=s && e>i[0]  || i[0]<s && i[1]>=s) res++;
        }
        return res;
    }
}