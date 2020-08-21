class Solution {
    public int minFlips(int a, int b, int c) {
        int cc = a|b;
        int res=0;
        while(c!=0||a!=0||b!=0){
            if((c&1)!=(cc&1)){
                if((c&1)==1) res++;
                else if((a&1)==1&&(b&1)==1)res+=2;
                else res++;
            }
            //System.out.println(c+"  "+cc+" "+res);
            a>>>=1;
            b>>>=1;
            c>>>=1;
            cc>>>=1;
        }
        return res;
    }
}