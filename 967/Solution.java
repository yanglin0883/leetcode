class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        k=K;
        for(int i=1;i<10;i++){
            dfs(N-1, i);
        }
        if(N==1) res.add(0, 0); // for N==1 cornor case
        int[] ret = new int[res.size()];
        for(int i=0;i<ret.length;i++)
            ret[i] = res.get(i);
        return ret;
    }
    ArrayList<Integer> res = new ArrayList();
    int k;
    void dfs(int N, int cur){
        if(N==0){
            res.add(cur);
            return;
        }
        int tail = cur % 10;
        cur *= 10;
        if(tail-k>=0)dfs(N-1, cur+tail-k);
        if(k!=0 &&tail+k<10)dfs(N-1, cur+tail+k);// for k==0 case
    }
}