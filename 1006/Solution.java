class Solution {
    public int clumsy(int N) {
        if(N==1) return 1;
        if(N==2) return 2;
        if(N==3) return 6;
        int res = N*(N-1)/(N-2);
        for(int i=N-3;i>0;i-=4){
            int temp=0;
            if(i>0) temp+=i;
            if(i>1){
                if(i>2){
                    if(i>3) temp -= (i-1)*(i-2)/(i-3);
                    else temp-=(i-1)*(i-2);
                }
                else temp -= i-1;
            }
            res+=temp;
        }
        return res;
    }
}