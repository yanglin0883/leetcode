class Solution {
    public int totalNQueens(int n) {
        if(n==1) return 1;
        if(n<4) return 0;
        this.n = n;
        dfs(new ArrayList<Integer>());
        return res;
    }
    int res=0, n;
    void dfs(ArrayList<Integer> path){
        if(path.size()==n){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(path.contains(i))continue;
            path.add(i);
            if(permitted(path)) dfs(path);
            path.remove(path.size()-1);
        }
    }
    boolean permitted(ArrayList<Integer> path){
        int m = path.size();
        for(int i=0;i<m-1;i++){
            int element = path.get(i);
            for(int j=1;j+i<m;j++){
                int temp = path.get(i+j);
                if(temp == element+j ||temp == element-j) return false;
            }
        }
        return true;
    }
}