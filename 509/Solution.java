class Solution {
    public int fib(int N) {
        if(N==0||N==1) return N;
        int pre =1, cur = 1;
        for(int i=2;i<N;i++){
            cur=cur+pre;
            pre=cur-pre;
        }
        return cur;
    }
}