class Solution {
    public int arrangeCoins(int n) {
        if(n<2)return n;
        int i=0,m=n;
        for(i=0;m>0;i++){
            if(m<i) return i-1;
            m-=i;            
        }
        return i-1;
    }
}