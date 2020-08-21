class Solution {
    public int numOfWays(int n) {
        return (int)(6*(dfs(true, n)+dfs(false,n))%1000000007);
    }
    long dfs(boolean i, int n){
        if(n==1){
            return 1;
        }
        if(i){
            return 2*dfs(false,n-1) + 3*dfs(true, n-1);
        }
        else{
            return 2*(dfs(true, n-1)+dfs(false, n-1));
        }
    }
}